package dto;

import EnityClass.Pool;

public class ProposalDto  {

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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getSuggestedTeacher() {
        return suggestedTeacher;
    }

    public Integer getStatus() {
        return status;
    }

    public Pool getPoolID() {
        return poolID;
    }
    
    

    public ProposalDto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //methods
    @Override
    public String toString() {
        return "[ID: " +id +"  Title: " + title + "  Teacher: " + suggestedTeacher + "  Status: " + status + "]";
    }
    
    

}
