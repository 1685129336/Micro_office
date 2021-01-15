package com.bawei.team.model.entity;

class TeamInfoEntity {

    /**
     * id : 14
     * teamname : 哈哈
     * teamcode : 89410653
     * creator : 120
     * creatorname : 能人
     * description : 一些简单的描述
     * ctime : 2021-01-13 18:38:34
     */

    private int id;
    private String teamname;
    private String teamcode;
    private int creator;
    private String creatorname;
    private String description;
    private String ctime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public String getTeamcode() {
        return teamcode;
    }

    public void setTeamcode(String teamcode) {
        this.teamcode = teamcode;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }
}
