package com.bawei.team.model.entity;

public class CreateTeamEntity {


    /**
     * creator : 0
     * creatorname :
     * ctime :
     * description :
     * id : 0
     * teamcode :
     * teamname :
     */

    private int creator;
    private String creatorname;
    private String ctime;
    private String description;
    private int id;
    private String teamcode;
    private String teamname;

    public CreateTeamEntity(int creator, String creatorname, String ctime, String description, int id, String teamcode, String teamname) {
        this.creator = creator;
        this.creatorname = creatorname;
        this.ctime = ctime;
        this.description = description;
        this.id = id;
        this.teamcode = teamcode;
        this.teamname = teamname;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public String getCreatorname() {
        return creatorname;
    }

    public void setCreatorname(String creatorname) {
        this.creatorname = creatorname;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamcode() {
        return teamcode;
    }

    public void setTeamcode(String teamcode) {
        this.teamcode = teamcode;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
}
