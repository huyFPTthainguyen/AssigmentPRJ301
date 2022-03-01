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
public class Coach {

    private int coachId;
    private String coachName;
    private String img;
    private int nationalityId;
    private int roleId;
    private String shortDescription;
    private String coachInfor;

    public Coach() {
    }

    public Coach(int coachId, String coachName, String img, int nationalityId, int roleId, String shortDescription, String coachInfor) {
        this.coachId = coachId;
        this.coachName = coachName;
        this.img = img;
        this.nationalityId = nationalityId;
        this.roleId = roleId;
        this.shortDescription = shortDescription;
        this.coachInfor = coachInfor;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getCoachInfor() {
        return coachInfor;
    }

    public void setCoachInfor(String coachInfor) {
        this.coachInfor = coachInfor;
    }

    @Override
    public String toString() {
        return "Coach{" + "coachId=" + coachId + ", coachName=" + coachName + ", img=" + img + ", nationalityId=" + nationalityId + ", roleId=" + roleId + ", shortDescription=" + shortDescription + ", coachInfor=" + coachInfor + '}';
    }

}
