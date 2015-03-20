package controller;

import EnityClass.Person;
import EnityClass.Pool;
import EnityClass.Proposal;
import Interfaces.ControllerGUI;
import dto.PersonDto;
import dto.ProposalDto;
import facades.PersonFacade;
import facades.ProposalFacade;
import java.util.ArrayList;
import java.util.List;

public class Controller implements ControllerGUI{
    ProposalFacade proposalManager = new ProposalFacade();
    PersonFacade personManager = new PersonFacade();

    @Override
    public List<ProposalDto> getAllProposals() {
        List<Proposal> proposals = proposalManager.getAllProposals();
        List<ProposalDto> returnProposals = new ArrayList();
        
        
        for(Proposal p : proposals){
         Integer status = p.getStatus();
        Pool poolID = p.getPoolID();
        
        if(status == null){
         status = 0;
        }
        if(poolID== null){
        poolID = new Pool(0, "0");
        }
        
       ProposalDto pd = new ProposalDto(p.getId(),p.getTitle(),p.getDescription(),p.getSuggestedTeacher(),status,poolID);
            returnProposals.add(pd);
        }
        
        return returnProposals;
    }

    @Override
    public void addProposal(String title, String description, String teacher) {
        Proposal p = new Proposal(title,  description,  teacher);
        proposalManager.addProposal(p);
    }

    @Override
    public List<ProposalDto> getProposalsFromRound(int status) {
       List<Proposal> proposals = proposalManager.getProposalsFromRound(status);
       List<ProposalDto> dtoProposal = new ArrayList();
       
       for(Proposal p : proposals){
           Pool poolID = p.getPoolID();
            if(poolID== null){
        poolID = new Pool(0, "0");
        }
       
       
       ProposalDto pd = new ProposalDto(p.getId(),p.getTitle(),p.getDescription(),p.getSuggestedTeacher(),p.getStatus(),poolID);
       
       
          dtoProposal.add(pd);
           
       }
       return dtoProposal;
    }

    @Override
    public void setFirstRoundSelection(Integer[] proposalId) {
        proposalManager.setStatusField(proposalId);
    }

    @Override
    public ProposalDto getOneProposal(String title) {
        
        Proposal p = proposalManager.getOneProposal(title);
        Integer status = p.getStatus();
        Pool poolID = p.getPoolID();
        
        if(status == null){
         status = 0;
        }
        if(poolID== null){
        poolID = new Pool(0, "0");
        }
        
       ProposalDto pd = new ProposalDto(p.getId(),p.getTitle(),p.getDescription(),p.getSuggestedTeacher(),status,poolID);
       return pd;
    }

    @Override
    public List<PersonDto> getAllPersons() {
        List<PersonDto> dtoPersons = new ArrayList();
        List<Person> persons = personManager.getAllPersons();
        
        for(Person p : persons){
            int id = p.getId();
            String fname = p.getFname();
            String lname = p.getLname();
            String role = p.getRole();
            
            
            String primary = p.getPrimaryProposals();
            String [] primaries = primary.split("|");
            int[] returnPrimary = null;
            int i = 0;
            for(String s : primaries){
                returnPrimary[i] = Integer.parseInt(s);
                i++;
            }
            
            String secondary = p.getSecondaryProposals();
            String [] secondaries = secondary.split("|");
            int[] returnSecondary = null;
            int x = 0;
            for(String s : secondaries){
                returnSecondary[i] = Integer.parseInt(s);
                i++;
            }
            
            PersonDto dto = new PersonDto(id,fname, lname, role);
            dto.setPrimary(returnPrimary);
            dto.setSecondary(returnSecondary);
            
            dtoPersons.add(dto);
        }
        return dtoPersons;
    }

    @Override
    public void setPrimaryAndSecondary(PersonDto person, int [] primary, int [] secondary) {
        personManager.addPrimaryAndSecondary(person, primary, secondary);
    }

    @Override
    public PersonDto getOnePerson(String fname, String lname) {
        Person p = personManager.getOnePerson(fname, lname);
        
        System.out.println(p);
        int id = p.getId();
           String rfname = p.getFname();
            String rlname = p.getLname();
            String role = p.getRole();
             String secondary = "";
            String primary = "";
            int[] returnSecondary = new int[2];
            int[] returnPrimary = new int [2];
            
           
           primary =  p.getPrimaryProposals();
            System.out.println("Primary 1 =  " + primary);
            if(primary.isEmpty() ||primary == null){
            primary = "0|0";
            }
            System.out.println("Primary 2 =  " + primary);
            String [] primaries = primary.split("\\|");
            
            for(String s: primaries){
                System.out.println("Loop Split" + s);
            }
            
            int i = 0;
            for(String s : primaries){
                System.out.println(Integer.parseInt(s));
                System.out.println(i);
                returnPrimary[i] = Integer.parseInt(s);
                i++;
            }
            
           secondary =  p.getSecondaryProposals();
            if(secondary.isEmpty() ||secondary == null){
            secondary = "0|0";
            String [] secondaries = secondary.split("\\|");
            
            int x = 0;
            for(String s : secondaries){
                returnSecondary[i] = Integer.parseInt(s);
                x++;
            }
            
            }
             PersonDto  dto = new PersonDto(id,rfname, rlname, role);
                System.out.println(dto.toString());
            dto.setPrimary(returnPrimary);
            dto.setSecondary(returnSecondary);
         
            return dto;
    }
}