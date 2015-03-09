package Interfaces;

import dto.ProposalDto;
import java.util.List;

/**
 *
 * @author Henrik
 */
 public interface ControllerGUI {
     
  List<ProposalDto> getAllProposals();
  void addProposal(String title, String description, String teacher);
  List<ProposalDto> getFirstRoundSelection();
  void setFirstRoundSelection(Integer[] proposalId);
  ProposalDto getOneProposal(String title);
      
  
}
