/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Coach;
import model.CoachRole;
import model.Nationality;

/**
 *
 * @author Admin
 */
public class ManagerDBcontext extends DBContext {

    public ArrayList<Nationality> getAllNationality() {
        ArrayList<Nationality> listNationality = new ArrayList<>();
        try {
            String sql = "select * from Nationality";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int nationalityId = rs.getInt(1);
                String nationalityName = rs.getString(2);
                String img = rs.getString(3);
                Nationality n = new Nationality(nationalityId, nationalityName, img);
                listNationality.add(n);
            }
        } catch (Exception e) {

        }
        return listNationality;
    }

    public ArrayList<Coach> getCoachs() {
        ArrayList<Coach> listCoachs = new ArrayList<>();

        try {
            String sql = "select * from Coach ";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Coach r = new Coach(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDate(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));
                listCoachs.add(r);
            }
        } catch (Exception e) {
        }
        return listCoachs;
    }

    public Coach getCoachId(int coachId) {

        try {
            String sql = "select * from Coach where Id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, coachId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                return new Coach(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getDate(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<CoachRole> getCoachRole() {
        ArrayList<CoachRole> PlayerRole = new ArrayList<>();
        try {
            String sql = "select * from CoachRole";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int roleId = rs.getInt(1);
                String roleName = rs.getString(2);

                CoachRole n = new CoachRole(roleId, roleName);
                PlayerRole.add(n);
            }
        } catch (Exception e) {

        }
        return PlayerRole;
    }
}
