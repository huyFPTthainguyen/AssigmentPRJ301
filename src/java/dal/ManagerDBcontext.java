/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Coach;
import model.CoachRole;
import model.Nationality;

/**
 *
 * @author Admin
 */
public class ManagerDBcontext extends DBContext {

    public static void main(String[] args) {
        ManagerDBcontext db = new ManagerDBcontext();
        db.addCoach("dfds", "dsfdsfd", "2022-12-2", 2, 3, "dfsfsdfdfd", "fdsfsaf", "sfdfsdfdsf");
    }

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
                Coach r = new Coach(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
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

                return new Coach(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getString(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<CoachRole> getCoachRole() {
        ArrayList<CoachRole> CoachRole = new ArrayList<>();
        try {
            String sql = "select * from CoachRole";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int roleId = rs.getInt(1);
                String roleName = rs.getString(2);

                CoachRole n = new CoachRole(roleId, roleName);
                CoachRole.add(n);
            }
        } catch (Exception e) {

        }
        return CoachRole;
    }

    public void addCoach(String coachName, String img, String dob, int nationalityId,
            int roleId, String imgBack,
            String shortDescription, String coachInfor) {
        String sql = "insert into Coach values(?,?,?,?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, coachName);
            stm.setString(2, img);
            stm.setString(3, dob);
            stm.setInt(4, nationalityId);
            stm.setInt(5, roleId);
            stm.setString(6, imgBack);
            stm.setString(7, shortDescription);
            stm.setString(8, coachInfor);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public void updateCoach(int coachId, String coachName, String img, String dob, int nationalityId,
            int roleId, String imgBack,
            String shortDescription, String coachInfor) {
        String sql = "update Coach set name = ?, img = ?, dob = ?,  nationalityId = ?, \n"
                + " roleId = ?, imgBack = ?,  description = ?,\n"
                + "infor = ? where id = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, coachName);
            stm.setString(2, img);
            stm.setString(3, dob);          
            stm.setInt(4, nationalityId);           
            stm.setInt(5, roleId);       
            stm.setString(6, imgBack);
            stm.setString(7, shortDescription);
            stm.setString(8, coachInfor);
            stm.setInt(9, coachId);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
    public void deleteCoach(int id) {
        String sql = "delete from Coach where id = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(PlayerDBcontext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }
}
