/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EnityClass;

import Interfaces.DBFacade;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Henrik
 */
public class EmManager implements DBFacade {

     EntityManagerFactory emf = Persistence.createEntityManagerFactory("dk.cphbusiness.oervald_SIP1Application_jar_1.0-SNAPSHOTPU");
    EntityManager em = emf.createEntityManager();
    
    @Override
    public ArrayList getAllProposals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addProposal(Proposal proposal) {
        em.getTransaction();
        em.persist(proposal);
        em.close();
    }

    @Override
    public Proposal getOneProposal(String title) {
        em.getTransaction();
       Proposal proposal = em.find(Proposal.class, title);
       em.close();
       return proposal;
    }
    
}
