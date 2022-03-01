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
public class News {

    private int newId;
    private String title;
    private String img;
    private Date datepublished;
    private String shortDescription;
    private String content;
    private int typeId;

    public News() {
    }

    public News(int newId, String title, String img, Date datepublished, String shortDescription, String content, int typeId) {
        this.newId = newId;
        this.title = title;
        this.img = img;
        this.datepublished = datepublished;
        this.shortDescription = shortDescription;
        this.content = content;
        this.typeId = typeId;
    }
    

    public int getNewId() {
        return newId;
    }

    public void setNewId(int newId) {
        this.newId = newId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Date getDatepublished() {
        return datepublished;
    }

    public void setDatepublished(Date datepublished) {
        this.datepublished = datepublished;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "News{" + "newId=" + newId + ", title=" + title + ", img=" + img + ", datepublished=" + datepublished + ", shortDescription=" + shortDescription + ", content=" + content + ", typeId=" + typeId + '}';
    }
    
}
