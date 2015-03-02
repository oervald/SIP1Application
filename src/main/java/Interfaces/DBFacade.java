/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import EnityClass.Proposal;
import java.util.ArrayList;

/**
 *
 * @author Henrik
 */
public interface DBFacade {
    public ArrayList getAllProposals();
    public void addProposal(Proposal proposal);
    public Proposal getOneProposal(String title);
    
}
