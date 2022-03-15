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
import model.News;
import model.TypeNews;

/**
 *
 * @author Admin
 */
public class NewDBcontext extends DBContext {

    public static void main(String[] args) {
        NewDBcontext db = new NewDBcontext();
        System.out.println(db.searchNews("ha"));
    }

    public ArrayList<News> getNews() {
        ArrayList<News> listNews = new ArrayList<>();

        try {
            String sql = "select * from News ";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }

    public ArrayList<TypeNews> getTypeNews() {
        ArrayList<TypeNews> typeNews = new ArrayList<>();
        try {
            String sql = "select * from TypeNews";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                TypeNews n = new TypeNews(rs.getInt(1), rs.getString(2));
                typeNews.add(n);

            }
        } catch (Exception e) {

        }
        return typeNews;
    }
    public ArrayList<News> getTop1NewsIsInterview()

    {
        ArrayList<News> listNews = new ArrayList<>();

        try {
            String sql = "select top 1 * from News\n"
                + "where typeId = 4\n"
                + "order by date desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }
    
    public ArrayList<News> getTop1NewIsPostMatch()

    {
        ArrayList<News> listNews = new ArrayList<>();

        try {
            String sql = "select top 1 * from News\n"
                + "where typeId = 2\n"
                + "order by date desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }
    public ArrayList<News> getLatestNews()

    {
        ArrayList<News> listNews = new ArrayList<>();

        try {
            String sql = "select top 1 * from News\n"
                + "where typeId = 3\n"
                + "order by date desc";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }

    public News getNewId(int newId) {

        try {
            String sql = "select * from News where id = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, newId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                return new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void addNew(String title, String img, String datepublished, String shortDescription, String content, int typeId) {
        String sql = "insert into News values(?,?,?,?,?,?)";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, title);
            stm.setString(2, img);
            stm.setString(3, datepublished);
            stm.setString(4, shortDescription);
            stm.setString(5, content);
            stm.setInt(6, typeId);
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

    public void updateNew(int newId, String title, String img, String datepublished, String shortDescription, String content, int typeId) {
        String sql = "update News set title = ?, img = ?, date = ?,  \n"
                + " description = ?,\n"
                + "content = ?, typeId = ? where id = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, title);
            stm.setString(2, img);
            stm.setString(3, datepublished);
            stm.setString(4, shortDescription);
            stm.setString(5, content);
            stm.setInt(6, typeId);
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

    public void deleteNew(int id) {
        String sql = "delete from News where id = ?";
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

    public ArrayList<News> getPageNew(int pageindex, int pagesize) {
        ArrayList<News> listNews = new ArrayList<>();
        try {
            String sql = "Select * from\n"
                    + "(SELECT *,ROW_NUMBER() OVER (ORDER BY id ASC) as row_index FROM News) new \n"
                    + "WHERE \n"
                    + "row_index >= (? -1)* ? +1 AND row_index <= ? * ? ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }

    public int count() {
        try {
            String sql = "SELECT count(*) as Total FROM News";
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
    public int getTotalNew() {

        try {
            String sql = "select count(*) from News";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }
    public ArrayList<News> searchNews(String input){
        ArrayList<News> listNews = new ArrayList<>();

        try {
            String sql = "select * from News where title like ? or description like ? or content like ?  ";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, "%"+input+"%");
            stm.setString(2, "%"+input+"%");
            stm.setString(3, "%"+input+"%");
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                News r = new News(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getInt(7));
                listNews.add(r);

            }
        } catch (Exception e) {

        }
        return listNews;
    }

}
