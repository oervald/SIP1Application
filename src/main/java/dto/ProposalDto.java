package dto;

public class ProposalDto {

    //declare variables
    private Integer id;
    private String title;
    private String description;
    private String suggestedTeacher;
    private Integer status;
    private PoolDto poolID;

    //constructor
    public ProposalDto(Integer id, String title, String description, String suggestedTeacher, Integer status, PoolDto poolID) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.suggestedTeacher = suggestedTeacher;
        this.status = status;
        this.poolID = poolID;

    }

    //methods
    @Override
    public String toString() {
        return id + "# " + title + "# " + suggestedTeacher;
    }

}
