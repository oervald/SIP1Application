/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dto;

import EnityClass.Person;

/**
 *
 * @author Henrik
 */
public class PersonDto extends Person{
    
    int id;
    String fname;
    String lname;
    String role;
    int [] primary;
    int [] secondary;
    
    public PersonDto(int id,String fname, String lname, String role){
    this.id = id;
    this.fname = fname;
    this.lname = lname;
    this.role = role;
  
    }
@Override
    public Integer getId() {
        return id;
    }

    public int[] getPrimary() {
        return primary;
    }

    public int[] getSecondary() {
        return secondary;
    }

    public void setPrimary(int[] primary) {
        this.primary = primary;
    }

    public void setSecondary(int[] secondary) {
        this.secondary = secondary;
    }

    @Override
    public String toString() {
        return "PersonDto{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", role=" + role + ", primary=" + primary + ", secondary=" + secondary + '}';
    }
    
    
    
    
}
