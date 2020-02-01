/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class ProductDAO implements CRUD{
    
    Connection con;
    Conexion cx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    int r;
    
    
     public Product listID(int id) {
        Product p = new Product();
        String SQL = "SELECT * FROM products WHERE PROD_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {                
                p.setId(rs.getInt(1));
                p.setSerial(rs.getString(2));
                p.setName(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setStock(rs.getInt(5));
                p.setPicture(rs.getString(6));
                p.setState(rs.getBoolean(7));
            }
        } catch (Exception e) {
        }
        
        return p;
    }
     
    public Product listBySerial(String code) {
        Product p = new Product();
        String SQL = "SELECT * FROM products WHERE PROD_Serial=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setString(1, code);
            rs = ps.executeQuery();
            while (rs.next()) {                
                p.setId(rs.getInt(1));
                p.setSerial(rs.getString(2));
                p.setName(rs.getString(3));
                p.setPrice(rs.getFloat(4));
                p.setStock(rs.getInt(5));
                p.setPicture(rs.getString(6));
                p.setState(rs.getBoolean(7));
            }
        } catch (Exception e) {
        }
        
        return p;
    }
    
    public int updateStock(int qty,int idp) {
        
        String SQL = "UPDATE products SET PROD_Stock=? WHERE PROD_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, qty);
            ps.setInt(2, idp);
            
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return r;
    }

    @Override
    public List list() {
        List<Product> products = new ArrayList<>();
        String SQL = "SELECT * FROM products";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()) {
                Product p = new Product();
                p.setSerial(rs.getString(1));
                p.setName(rs.getString(2));
                p.setPrice(rs.getFloat(3));
                p.setStock(rs.getInt(4));
                p.setPicture(rs.getString(5));
                p.setState(rs.getBoolean(6));
                
                products.add(p);
            }
        } catch (Exception e) {
        }
        
        return products;
    }

    @Override
    public int add(Object[] o) {
        
        String SQL = "INSERT INTO products (PROD_Name,PROD_Price,PROD_Stock,PROD_Picture,PROD_Flag) VALUES (?,?,?,?,?)";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public int update(Object[] o) {
        
        String SQL = "UPDATE products SET PROD_Name=?,PROD_Price=?,PROD_Stock=?,PROD_Picture=?,PROD_Flag=? WHERE PROD_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }

    @Override
    public void delete(int id) {
        String SQL = "DELETE FROM clients WHERE PROD_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
    
    
    
}
