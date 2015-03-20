/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */







import facades.ProposalFacade;
import EnityClass.Person;
import EnityClass.Proposal;
import java.util.ArrayList;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Henrik
 */
public class ProposalTest {

    @Test
    public void testAddOneProposal() throws InterruptedException{
        Proposal p = new Proposal("Test Title", "Test Description", "Test Teacher");
        Proposal q = null;
        ProposalFacade manager = new ProposalFacade();
        manager.addProposal(p);
        
       
        q = manager.getOneProposal("Test Title");
        
        assertThat(p.getTitle() , is (q.getTitle()));
        assertThat(p.getDescription(), is(q.getDescription()));
        assertThat(p.getSuggestedTeacher(), is(q.getSuggestedTeacher()));
        
        
    }
    
    
    @Test
    public void testGetAll(){
    ProposalFacade manager = new ProposalFacade();
   List<Person> persons = manager.getAllProposals();
    assertThat(persons.size() , is(1));
    }
    
    @Test
    public void testAddPerson(){
    ProposalFacade manager = new ProposalFacade();
    Person p = new Person( "Test FPerson", "Test LPerson", "TestPerson");
    
    manager.addPerson(p);
    }
    
    @Test
    public void testGetProposalsFromRound(){
    
    ProposalFacade manager = new ProposalFacade();
    List <Proposal> proposals = manager.getProposalsFromRound(1);
        System.out.println(proposals);
       
    List<Integer> rounds = new ArrayList();
    int i = 1;
    for(Proposal p : proposals ){
        
        rounds.set(i, i);
        System.out.println(rounds);
     
        i++;
       
    }
        System.out.println(rounds);
    for(Integer q : rounds){
    assertThat(q , is(1));
    }
    
    
    }
}
