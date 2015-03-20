/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facades;

import EnityClass.Person;
import EnityClass.Person;
import EnityClass.Proposal;
import EnityClass.Proposal;
import Interfaces.ProposalInterface;
import Interfaces.ProposalInterface;
import Interfaces.ProposalInterface;
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
public class ProposalFacade implements ProposalInterface {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory("dk.cphbusiness.oervald_SIP1Application");
    
    
    
    @Override
    public List getAllProposals() {
         EntityManager em = emf.createEntityManager();
        List<Proposal> proposals = null;
        Query query = em.createNamedQuery("Proposal.getAllProposals");
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        try{
        
        proposals = (List<Proposal>) query.getResultList();
        
        
        }catch(Exception e){
            System.err.println(e.getMessage());
            transaction.rollback();
        }
        em.close();
        return proposals;
    }

    @Override
    public void addProposal(Proposal proposal) {
         EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
         try {
            em.persist(proposal);
            transaction.commit();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            transaction.rollback();
        }
        
        em.close();
        getOneProposal("Title from GUI");
     
    }

    @Override
    public Proposal getOneProposal(String title) {
         EntityManager em = emf.createEntityManager();
        List<Proposal> proposal = null;
       
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        
        try{
         Query query = em.createNamedQuery("Proposal.findOneProposal");
        query.setParameter("title", title);
          proposal = (List<Proposal>) query.getResultList();
        }catch(Exception e){
        System.err.println(e.getMessage());
        }
        
        em.close();
        System.out.println(" before return:  " + proposal.get(0));
       return proposal.get(0);
    }

     @Override
    public void addPerson(Person person) {
         EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(person);
        em.close();
    }

    @Override
    public void setStatusField(Integer [] proposalIDs) {
        
          for(Integer i : proposalIDs){
             System.out.println(i);
         }
        
        
         for(Integer i : proposalIDs){
             EntityManager em = emf.createEntityManager();
             EntityTransaction transaction = em.getTransaction();
             transaction.begin();
             Proposal temp = em.find(Proposal.class, i);
             System.out.println(" Before change   "+ temp);
             
             temp.setStatus(1);
             transaction.commit();
             
             System.out.println(" After change  "+em.find(Proposal.class, i));
             
             
         
         }
         
        
    }

    @Override
    public List getProposalsFromRound(int status) {
         
         EntityManager em = emf.createEntityManager();
        List<Proposal> proposal = null;
       
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        
        try{
         Query query = em.createNamedQuery("Proposal.getProposalsFromRound");
        query.setParameter("status", status);
          proposal = (List<Proposal>) query.getResultList();
        }catch(Exception e){
        System.err.println(e.getMessage());
        }
        
        em.close();
        return proposal;
        
        
    }

    
}
