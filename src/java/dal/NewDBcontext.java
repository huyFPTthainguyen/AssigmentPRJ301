/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.News;
import model.TypeNews;

/**
 *
 * @author Admin
 */
public class NewDBcontext extends DBContext {

    public static void main(String[] args) {
        NewDBcontext db = new NewDBcontext();
        System.out.println(db.getNewId(1));
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

}
