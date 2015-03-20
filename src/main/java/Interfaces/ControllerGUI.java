package Interfaces;

import dto.PersonDto;
import dto.ProposalDto;
import java.util.List;

/**
 *
 * @author Henrik
 */
 public interface ControllerGUI {
     
  List<ProposalDto> getAllProposals();
  void addProposal(String title, String description, String teacher);
  List<ProposalDto> getProposalsFromRound(int round);
  void setFirstRoundSelection(Integer[] proposalId);
  ProposalDto getOneProposal(String title);
  List<PersonDto> getAllPersons();
  void setPrimaryAndSecondary(PersonDto person, int [] primary, int [] secondary);
  PersonDto getOnePerson(String fname, String lname);
  
      
  
}
