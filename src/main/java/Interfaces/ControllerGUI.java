package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Henrik
 */
 interface ControllerGUI {
     
  ArrayList getAllProposals();
  Boolean addProposal(String title, String description, String teacher);
  void getFirstRoundSelection(int[] proposalId);
  
}
