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
import model.Nationality;
import model.Player;
import model.PlayerRole;

/**
 *
 * @author Admin
 */
public class PlayerDBcontext extends DBContext {

    public static void main(String[] args) {
        PlayerDBcontext db = new PlayerDBcontext();
        db.addPlayer("fsdfsd", "fsdfsdf", "2022-12-2", "fsdfsdfsd", 2, 3, 1, 2, 1, "fsdfsdfsd", "fsdfsdfsd", "fsdfsdfsd");
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

    public ArrayList<Player> getAllGoalkeepers() {
        ArrayList<Player> listPlayer = new ArrayList<>();

        try {
            String sql = "select * from Player where roleId = 1";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllDefenders() {
        ArrayList<Player> listPlayer = new ArrayList<>();

        try {
            String sql = "select * from Player where roleId = 2";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllMidfielders() {
        ArrayList<Player> listPlayer = new ArrayList<>();

        try {
            String sql = "select * from Player where roleId = 3";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public ArrayList<Player> getAllForwards() {
        ArrayList<Player> listPlayer = new ArrayList<>();

        try {
            String sql = "select * from Player where roleId = 4";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayer.add(r);
            }
        } catch (Exception e) {
        }
        return listPlayer;
    }

    public Player getPlayerById(int playerId) {

        try {
            String sql = "select * from Player where Id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, playerId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                return new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<PlayerRole> getPlayerRole() {
        ArrayList<PlayerRole> PlayerRole = new ArrayList<>();
        try {
            String sql = "select * from PlayerRole";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                int roleId = rs.getInt(1);
                String roleName = rs.getString(2);

                PlayerRole n = new PlayerRole(roleId, roleName);
                PlayerRole.add(n);
            }
        } catch (Exception e) {

        }
        return PlayerRole;
    }

    public ArrayList<Player> getAllPlayer() {
        ArrayList<Player> listPlayers = new ArrayList<>();
        try {
            String sql = "select * from Player";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayers.add(r);

            }
        } catch (Exception e) {

        }
        return listPlayers;
    }

    public void addPlayer(String playerName, String img, String dob, String birthPlace, int nationalityId,
            int height, int weight, int roleId, int number, String imgBack,
            String shortDescription, String playerInfor) {
        String sql = "insert into Player values(?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, playerName);
            stm.setString(2, img);
            stm.setString(3, dob);
            stm.setString(4, birthPlace);
            stm.setInt(5, nationalityId);
            stm.setInt(6, height);
            stm.setInt(7, weight);
            stm.setInt(8, roleId);
            stm.setInt(9, number);
            stm.setString(10, imgBack);
            stm.setString(11, shortDescription);
            stm.setString(12, playerInfor);
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
    
    public void updatePlayer(int playerId, String playerName, String img, String dob, String birthPlace, int nationalityId,
            int height, int weight, int roleId, int number, String imgBack,
            String shortDescription, String playerInfor) {
        String sql = "update Player set name = ?, img = ?, dob = ?, birthPlace = ?, nationalityId = ?, \n"
                + "height = ?, [weight] = ?, roleId = ?, number = ?, imgBack = ?,  description = ?,\n"
                + "infor = ? where id = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, playerName);
            stm.setString(2, img);
            stm.setString(3, dob);
            stm.setString(4, birthPlace);
            stm.setInt(5, nationalityId);
            stm.setInt(6, height);
            stm.setInt(7, weight);
            stm.setInt(8, roleId);
            stm.setInt(9, number);
            stm.setString(10, imgBack);
            stm.setString(11, shortDescription);
            stm.setString(12, playerInfor);
            stm.setInt(13, playerId);
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
    
    public void deletePlayer(int id) {
        String sql = "delete from Player where id = ?";
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
    public ArrayList<Player> getPagePlayer(int pageindex, int pagesize) {
        ArrayList<Player> listPlayers = new ArrayList<>();
        try {
            String sql = "Select * from\n"
                    + "(SELECT *,ROW_NUMBER() OVER (ORDER BY id ASC) as row_index FROM Player) player \n"
                    + "WHERE \n"
                    + "row_index >= (? -1)* ? +1 AND row_index <= ? * ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Player r = new Player(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4),
                        rs.getString(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
                        rs.getInt(9), rs.getInt(10), rs.getString(11), rs.getString(12), rs.getString(13));
                listPlayers.add(r);

            }
        } catch (Exception e) {

        }
        return listPlayers;
    }
    public int count()
    {
        try {
            String sql = "SELECT count(*) as Total FROM Player";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next())
            {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
    public int getTotalPlayer() {

        try {
            String sql = "select count(*) from Player";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

}
