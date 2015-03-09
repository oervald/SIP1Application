package controller;

import EnityClass.EmManager;
import EnityClass.Pool;
import EnityClass.Proposal;
import Interfaces.ControllerGUI;
import dto.ProposalDto;
import java.util.ArrayList;
import java.util.List;

public class Controller implements ControllerGUI{
    EmManager manager = new EmManager();

    @Override
    public List<ProposalDto> getAllProposals() {
        List<Proposal> proposals = manager.getAllProposals();
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
            System.out.println(pd);
            returnProposals.add(pd);
        }
        
        return returnProposals;
    }

    @Override
    public void addProposal(String title, String description, String teacher) {
        Proposal p = new Proposal(title,  description,  teacher);
        manager.addProposal(p);
    }

    @Override
    public List<ProposalDto> getFirstRoundSelection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFirstRoundSelection(Integer[] proposalId) {
        manager.setStatusField(proposalId);
    }

    @Override
    public ProposalDto getOneProposal(String title) {
        
        Proposal p = manager.getOneProposal(title);
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

    
}