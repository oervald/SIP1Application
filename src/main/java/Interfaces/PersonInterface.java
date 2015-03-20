/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import EnityClass.Person;
import java.util.List;

/**
 *
 * @author Henrik
 */
public interface PersonInterface {
    public void addNewPerson(Person person);
    public void addPrimaryAndSecondary(Person person,int[] primary, int [] secondary);
    public Person getOnePerson(String fname, String lname);
    public List<Person> getAllPersons();
    
    
}
