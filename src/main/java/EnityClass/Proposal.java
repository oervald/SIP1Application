/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnityClass;

import Interfaces.ProposalInterface;
import java.io.Serializable;
import java.util.ArrayList;
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
@NamedQueries({
    @NamedQuery(
            name = "Proposal.findOneProposal",
            query = "SELECT p FROM Proposal p WHERE p.title = :title"
    ),
    @NamedQuery(
            name = "Proposal.getAllProposals",
            query = "SELECT p FROM Proposal p"
    ),
    @NamedQuery(
            name = "Proposal.getProposalsFromRound",
            query = "SELECT p FROM Proposal p WHERE p.status = :status"
    )
})

@Table(name = "proposal")
@XmlRootElement

public class Proposal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

    public Proposal(String title, String description, String suggedstedTeacher) {
        
        this.title = title;
        this.description = description;
        this.suggestedTeacher = suggedstedTeacher;
        this.status = 0;
      
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
    public String toString() {
        return "EnityClass.Proposal[ id=" + id + " ] " + description + "  " + suggestedTeacher;
    }

}
