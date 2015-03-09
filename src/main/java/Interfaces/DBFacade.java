/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import EnityClass.Person;
import EnityClass.Proposal;
import java.util.List;

/**
 *
 * @author Henrik
 */
public interface DBFacade {
    public List getAllProposals();
    public void addProposal(Proposal proposal);
    public Proposal getOneProposal(String title);
    public void addPerson(Person person);
    public void setStatusField(Integer [] proposalIDs);
    
}
