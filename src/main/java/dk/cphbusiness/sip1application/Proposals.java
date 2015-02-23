/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dk.cphbusiness.sip1application;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "PROPOSALS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proposals.findAll", query = "SELECT p FROM Proposals p"),
    @NamedQuery(name = "Proposals.findByTitle", query = "SELECT p FROM Proposals p WHERE p.title = :title"),
    @NamedQuery(name = "Proposals.findByDescirption", query = "SELECT p FROM Proposals p WHERE p.descirption = :descirption"),
    @NamedQuery(name = "Proposals.findByTeacher", query = "SELECT p FROM Proposals p WHERE p.teacher = :teacher")})
public class Proposals implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCIRPTION")
    private String descirption;
    @Column(name = "TEACHER")
    private String teacher;

    public Proposals() {
    }

    public Proposals(String title, String description, String teacher) {
        this.title = title;
        this.descirption = description;
        this.teacher = teacher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescirption() {
        return descirption;
    }

    public void setDescirption(String descirption) {
        this.descirption = descirption;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (title != null ? title.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proposals)) {
            return false;
        }
        Proposals other = (Proposals) object;
        if ((this.title == null && other.title != null) || (this.title != null && !this.title.equals(other.title))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dk.cphbusiness.sip1application.Proposals[ title=" + title + " ]";
    }
    
}
