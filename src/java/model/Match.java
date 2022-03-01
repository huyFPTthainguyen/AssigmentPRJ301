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
public class Match {

    private int matchId;
    private Date dateMatch;
    private String place;
    private int tournamentId;
    private int homeId;
    private int awayId;

    public Match() {
    }

    public Match(int matchId, Date dateMatch, String place, int tournamentId, int homeId, int awayId) {
        this.matchId = matchId;
        this.dateMatch = dateMatch;
        this.place = place;
        this.tournamentId = tournamentId;
        this.homeId = homeId;
        this.awayId = awayId;
    }
    

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public Date getDateMatch() {
        return dateMatch;
    }

    public void setDateMatch(Date dateMatch) {
        this.dateMatch = dateMatch;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    public int getAwayId() {
        return awayId;
    }

    public void setAwayId(int awayId) {
        this.awayId = awayId;
    }

    @Override
    public String toString() {
        return "Match{" + "matchId=" + matchId + ", dateMatch=" + dateMatch + ", place=" + place + ", tournamentId=" + tournamentId + ", homeId=" + homeId + ", awayId=" + awayId + '}';
    }

}
