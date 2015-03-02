/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package EnityClass;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Henrik
 */
@Entity
@Table(name = "pool")
@XmlRootElement
public class Pool implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "poolID")
    private Collection<Proposal> proposalCollection;

    public Pool() {
    }

    public Pool(Integer id, String title) {
        this.id = id;
        this.title = title;
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

    @XmlTransient
    public Collection<Proposal> getProposalCollection() {
        return proposalCollection;
    }

    public void setProposalCollection(Collection<Proposal> proposalCollection) {
        this.proposalCollection = proposalCollection;
    }

    @Override
    public String toString() {
        return "EnityClass.Pool[ id=" + id + " ]";
    }
    
}
