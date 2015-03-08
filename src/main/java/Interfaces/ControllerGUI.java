package Interfaces;

import dto.ProposalDto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Henrik
 */
 interface ControllerGUI {
     
  ArrayList getAllProposals();
  Boolean addProposal(String title, String description, String teacher);
  List<ProposalDto> getFirstRoundSelection();
  void setFirstRoundSelection(int[] proposalId);
  
}
