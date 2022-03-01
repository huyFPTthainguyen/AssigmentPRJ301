/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class MyOpponent {

    private int teamId;
    private String teamName;
    private String img;

    public MyOpponent() {
    }

    public MyOpponent(int teamId, String teamName, String img) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.img = img;
    }
    

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "MyOpponent{" + "teamId=" + teamId + ", teamName=" + teamName + ", img=" + img + '}';
    }

}
