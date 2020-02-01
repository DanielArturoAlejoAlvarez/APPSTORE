/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author daniel
 */
public class UserDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Conexion cx = new Conexion();
    Connection con;
    
    
    public User validateUser(String username,String password) {
        User user = new User();
        
        String SQL = "SELECT * FROM users WHERE USER_Username=? AND USER_Password=?";
        
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setString(1, username);
            ps.setString(2, password);
            rs=ps.executeQuery();
            while (rs.next()) {                
                user.setId(rs.getInt(1));
                user.setFullname(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setUsername(rs.getString(4));
                user.setPassword(rs.getString(5));
                user.setPhone(rs.getString(6));
                user.setAvatar(rs.getString(7));
                user.setState(rs.getBoolean(8));
            }
        } catch (Exception e) {
        }
        
        return user;
    }
    
    public User listID(int id) {
        User u = new User();
        String SQL = "SELECT * FROM users WHERE USER_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                u.setId(rs.getInt(1));
                u.setFullname(rs.getString(2));
                u.setEmail(rs.getString(3));
                u.setUsername(rs.getString(4));
                u.setPassword(rs.getString(5));
                u.setPhone(rs.getString(6));
                u.setAvatar(rs.getString(7));
                u.setState(rs.getBoolean(8));
            }
        } catch (Exception e) {
        }
        
        return u;
    }
    
    
    
   
    
}
