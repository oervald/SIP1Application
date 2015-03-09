package dto;

import EnityClass.Pool;
import EnityClass.Proposal;

public class ProposalDto extends Proposal {

    //declare variables
    private Integer id;
    private String title;
    private String description;
    private String suggestedTeacher;
    private Integer status;
    private Pool poolID;

    //constructor
    public ProposalDto(Integer id, String title, String description, String suggestedTeacher, Integer status, Pool poolID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.suggestedTeacher = suggestedTeacher;
        this.status = status;
        this.poolID = poolID;

    }

    public ProposalDto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //methods
    @Override
    public String toString() {
        return id + "# " + title + "# " + suggestedTeacher + "#" + status;
    }
    
    

}
