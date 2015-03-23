/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import EnityClass.Person;
import Interfaces.PersonInterface;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Henrik
 */
public class PersonFacade implements PersonInterface {
    
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dk.cphbusiness.oervald_SIP1Application");

    @Override
    public void addNewPerson(Person person) {
         EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
         try {
            em.persist(person);
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            transaction.rollback();
        }
        
        em.close();
    }

    @Override
    public void addPrimaryAndSecondary(Person person,int[] primary, int[] secondary) {
        
        
        String firstP = Integer.toString(primary[0]);
        String secondP = Integer.toString(primary[1]);
       
        StringBuilder pp = new StringBuilder();
        StringBuilder primaries;
        primaries = pp.append(firstP).append("|").append(secondP);
                
        String firstS = Integer.toString(secondary[0]);
        String secondS = Integer.toString(secondary[1]);
        
        StringBuilder sp = new StringBuilder();
        StringBuilder secondaries;
        secondaries = sp.append(firstS).append("|").append(secondS);
        
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
         
        try {
            Person p = em.find(Person.class, person.getId());
            p.setPrimaryProposals(primaries.toString());
            p.setSecondaryProposals(secondaries.toString());
            em.persist(p);
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            transaction.rollback();
        }
        
     
        em.close();
        
        
    }

    @Override
    public Person getOnePerson(String fname, String lname) {
        List<Person> persons = new ArrayList();
        EntityManager em = emf.createEntityManager();
        Query query = em.createNamedQuery("Person.findOnePerson");
         query.setParameter("fname", fname);
         query.setParameter("lname", lname);
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        try{
             persons= (List<Person>) query.getResultList();
        
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        em.close();
        if(persons.get(0) == null){
            return null;
        }
        return persons.get(0);
    }

    @Override
    public List<Person> getAllPersons() {
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        List<Person> persons = new ArrayList();
        Query query = em.createNamedQuery("Person.getAllPersons");
        
        transaction.begin();
        try{
        persons = (List<Person>)query.getResultList();
        
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        em.close();
        
        return persons;
        
    }
    
}
