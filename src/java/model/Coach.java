/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author Admin
 */
public class Coach {

    private int coachId;
    private String coachName;
    private String img;
    private Date dob;
    private int nationalityId;
    private int roleId;
    private String imgBack;
    private String shortDescription;
    private String coachInfor;

    public Coach() {
    }

    public Coach(int coachId, String coachName, String img, Date dob, int nationalityId, int roleId, String imgBack, String shortDescription, String coachInfor) {
        this.coachId = coachId;
        this.coachName = coachName;
        this.img = img;
        this.dob = dob;
        this.nationalityId = nationalityId;
        this.roleId = roleId;
        this.imgBack = imgBack;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
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

    public String getImgBack() {
        return imgBack;
    }

    public void setImgBack(String imgBack) {
        this.imgBack = imgBack;
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
        return "Coach{" + "coachId=" + coachId + ", coachName=" + coachName + ", img=" + img + ", dob=" + dob + ", nationalityId=" + nationalityId + ", roleId=" + roleId + ", imgBack=" + imgBack + ", shortDescription=" + shortDescription + ", coachInfor=" + coachInfor + '}';
    }
    
    
    

}
