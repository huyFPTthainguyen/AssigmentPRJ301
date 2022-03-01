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
public class Player {

    private int playerId;
    private String playerName;
    private String img;
    private Date dob;
    private String birthPlace;
    private int nationalityId;
    private int height;
    private int weight;
    private int roleId;
    private String imgBackground;
    private int number;
    private String shortDescription;
    private String playerInfor;

    public Player() {
    }

    public Player(int playerId, String playerName, String img, Date dob, String birthPlace, int nationalityId, int height, int weight, int roleId, String imgBackground, int number, String shortDescription, String playerInfor) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.img = img;
        this.dob = dob;
        this.birthPlace = birthPlace;
        this.nationalityId = nationalityId;
        this.height = height;
        this.weight = weight;
        this.roleId = roleId;
        this.imgBackground = imgBackground;
        this.number = number;
        this.shortDescription = shortDescription;
        this.playerInfor = playerInfor;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
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

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public int getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(int nationalityId) {
        this.nationalityId = nationalityId;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getImgBackground() {
        return imgBackground;
    }

    public void setImgBackground(String imgBackground) {
        this.imgBackground = imgBackground;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getPlayerInfor() {
        return playerInfor;
    }

    public void setPlayerInfor(String playerInfor) {
        this.playerInfor = playerInfor;
    }

    
}
