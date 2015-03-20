/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EnityClass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Henrik
 */
@Entity
@NamedQueries({
    @NamedQuery(
            name = "Person.findOnePerson",
            query = "SELECT p FROM Person p WHERE p.fname = :fname AND p.lname = :lname"
    ),
    @NamedQuery(
            name = "Person.getAllPersons",
            query = "SELECT p FROM Person p"
    )})
@Table(name = "person")
@XmlRootElement

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "role")
    private String role;
    @Column(name = "primaryProposals")
    private String primaryProposals;
    @Column(name = "secondaryProposals")
    private String secondaryProposals;

    public Person() {
    }

    public Person( String fname, String lname, String role) {
        
        this.fname = fname;
        this.lname = lname;
        this.role = role;
    }

    public String getPrimaryProposals() {
        return primaryProposals;
    }

    public void setPrimaryProposals(String primaryProposals) {
        this.primaryProposals = primaryProposals;
    }

    public String getSecondaryProposals() {
        return secondaryProposals;
    }

    public void setSecondaryProposals(String secondaryProposals) {
        this.secondaryProposals = secondaryProposals;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "EnityClass.Person[ id=" + id + " ]";
    }
    
}
