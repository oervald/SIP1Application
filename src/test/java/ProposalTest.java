/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EnityClass.EmManager;
import EnityClass.Person;
import EnityClass.Proposal;
import static java.security.MessageDigest.isEqual;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
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
        EmManager manager = new EmManager();
        manager.addProposal(p);
        
       
        q = manager.getOneProposal("Test Title");
        System.out.println("THIS IS NOT NULL : " + q);
        
        assertThat(p.getTitle() , is (q.getTitle()));
        assertThat(p.getDescription(), is(q.getDescription()));
        assertThat(p.getSuggestedTeacher(), is(q.getSuggestedTeacher()));
        
        
    }
    
    
    @Test
    public void testGetAll(){
    EmManager manager = new EmManager();
   List<Person> persons = manager.getAllProposals();
    assertThat(persons.size() , is(1));
    }
    
    @Test
    public void testAddPerson(){
    EmManager manager = new EmManager();
    Person p = new Person( "Test FPerson", "Test LPerson", "TestPerson");
    
    manager.addPerson(p);
    }
}
