package com.clicks.yogi.custom_listview;

public class Hello {

    private String name;
    private String lastName;
    private String Team;

    public Hello() {
        // Empty Constructor
    }

    public Hello(String name, String lastName, String team) {
        this.name = name;
        this.lastName = lastName;
        Team = team;
    }

    // Getter and setter methods...

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }
}
