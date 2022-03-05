/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;

/**
 *
 * @author Admin
 */
public class AccountDBcontext extends DBContext {

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
}
