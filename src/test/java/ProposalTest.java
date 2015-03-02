/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EnityClass.EmManager;
import EnityClass.Proposal;
import static java.security.MessageDigest.isEqual;
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
    public void addOneProposal(){
        Proposal p = new Proposal("Test Title", "Test Description", "Test Teacher");
        Proposal q;
        EmManager manager = new EmManager();
        manager.addProposal(p);
        
        q = manager.getOneProposal("Test Title");
        
        assertThat(p.getTitle() , is (q.getTitle()));
        assertThat(p.getDescription(), is(q.getDescription()));
        assertThat(p.getSuggestedTeacher(), is(q.getSuggestedTeacher()));
    }
}
