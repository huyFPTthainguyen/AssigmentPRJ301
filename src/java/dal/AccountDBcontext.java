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
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDBcontext extends DBContext {

       public static void main(String[] args) {
        AccountDBcontext db = new AccountDBcontext();
        db.registerAccount("admin", "123");
    }
    public Account getAccount(String userName, String password) {
        try {
            String sql = "Select * \n"
                    + "from Account\n"
                    + "where name=? and pass=?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, userName);
            stm.setString(2, password);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account account = new Account();
                account.setUserId(rs.getInt("id"));
                account.setUserName(rs.getString("name"));
                account.setPassword(rs.getString("pass"));
                account.setIsAdmin(rs.getBoolean("isAdmin"));
                return account;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Account> getPageAccount(int pageindex, int pagesize) {
        ArrayList<Account> listaccount = new ArrayList<>();
        try {
            String sql = "Select * from\n"
                    + "(SELECT *,ROW_NUMBER() OVER (ORDER BY id ASC) as row_index FROM Account) account \n"
                    + "WHERE \n"
                    + "row_index >= (? -1)* ? +1 AND row_index <= ? * ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Account r = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4));
                listaccount.add(r);

            }
        } catch (Exception e) {

        }
        return listaccount;
    }

    public int count() {
        try {
            String sql = "SELECT count(*) as Total FROM Account";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(NewDBcontext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int getTotalAccount() {

        try {
            String sql = "select count(*) from Account";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public Account checkAccountExist(String userName) {

        try {
            String sql = "select * from Account where name = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            stm.setString(1, userName);
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2),
                        rs.getString(3), rs.getBoolean(4));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public void registerAccount(String userName, String password) {
        
        try {
            String sql = "insert into Account values(?,?,0)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, userName);
            stm.setString(2, password);           
            stm.executeUpdate();
            ResultSet rs = stm.executeQuery();
        } catch (Exception e) {
        }
    }
}
