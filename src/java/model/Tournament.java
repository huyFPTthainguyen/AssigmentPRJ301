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
public class Tournament {

    private int tournamentId;
    private String tournamentName;
    private String img;

    public Tournament() {
    }

    public Tournament(int tournamentId, String tournamentName, String img) {
        this.tournamentId = tournamentId;
        this.tournamentName = tournamentName;
        this.img = img;
    }
    

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Tournament{" + "tournamentId=" + tournamentId + ", tournamentName=" + tournamentName + ", img=" + img + '}';
    }

}
