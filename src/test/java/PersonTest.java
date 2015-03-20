
import EnityClass.Person;
import facades.PersonFacade;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrik
 */
public class PersonTest {
    
    @Test
    public void testAddOnePerson(){
    PersonFacade pf = new PersonFacade();
    Person p = new Person("Test", "Test", "Test");
    
    pf.addNewPerson(p);
    
    Person q = pf.getOnePerson("Test", "Test");
    
    assertThat(q.getLname(), is (p.getLname()));
    assertThat(q.getFname(), is (p.getFname()));
    
    }
    
    @Test
    public void testAddPrimaryAndSecondary(){
   
    PersonFacade pf = new PersonFacade();
    Person person = pf.getOnePerson("Test", "Test");
    int [] p = {
    1234,5678
    };
    int [] s = {
    8765,4321
    };
    pf.addPrimaryAndSecondary(person,p, s);
    
    Person x = pf.getOnePerson("Test", "Test");
    
    assertThat(x.getPrimaryProposals(), is("1234|5678"));
    assertThat(x.getSecondaryProposals(), is("8765|4321"));
   
    }
    
    
}
