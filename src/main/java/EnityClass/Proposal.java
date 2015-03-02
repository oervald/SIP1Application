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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Henrik
 */
@Entity
@Table(name = "proposal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proposal.findAll", query = "SELECT p FROM Proposal p"),
    @NamedQuery(name = "Proposal.findById", query = "SELECT p FROM Proposal p WHERE p.id = :id"),
    @NamedQuery(name = "Proposal.findByTitle", query = "SELECT p FROM Proposal p WHERE p.title = :title"),
    @NamedQuery(name = "Proposal.findBySuggestedTeacher", query = "SELECT p FROM Proposal p WHERE p.suggestedTeacher = :suggestedTeacher"),
    @NamedQuery(name = "Proposal.findByStatus", query = "SELECT p FROM Proposal p WHERE p.status = :status")})
public class Proposal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "title")
    private String title;
    @Lob
    @Column(name = "description")
    private String description;
    @Column(name = "suggested_teacher")
    private String suggestedTeacher;
    @Column(name = "status")
    private Integer status;
    @JoinColumn(name = "poolID", referencedColumnName = "ID")
    @ManyToOne
    private Pool poolID;

    public Proposal() {
    }

    public Proposal(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuggestedTeacher() {
        return suggestedTeacher;
    }

    public void setSuggestedTeacher(String suggestedTeacher) {
        this.suggestedTeacher = suggestedTeacher;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Pool getPoolID() {
        return poolID;
    }

    public void setPoolID(Pool poolID) {
        this.poolID = poolID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proposal)) {
            return false;
        }
        Proposal other = (Proposal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EnityClass.Proposal[ id=" + id + " ]";
    }
    
}
