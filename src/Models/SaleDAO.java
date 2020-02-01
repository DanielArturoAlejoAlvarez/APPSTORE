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
public class SaleDAO {
    
    Connection con;
    Conexion cx = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    int r = 0;
    
    public String serialNumber() {
        String serial = "";
        
        String SQL = "SELECT max(SALE_Serial) FROM sales";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                serial = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return serial;
    }
    
    public String idSales() {
        String idsales = "";
        String SQL = "SELECT max(SALE_Code) FROM sales";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()) {
                idsales = rs.getString(1);
            }
        } catch (Exception e) {
        }
        return idsales;
    }
    

    public List listSale() {
        List<Sale> sales = new ArrayList<>();
        String SQL = "SELECT * FROM sales";
        
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while(rs.next()) {
                Sale s = new Sale();
                s.setId(rs.getInt(1));
                s.setIdClient(rs.getInt(2));
                s.setIdUser(rs.getInt(3));
                s.setSerial(rs.getString(4));
                s.setDate(rs.getString(5));
                s.setTotal(rs.getFloat(6));
                s.setState(rs.getBoolean(7));
                
                sales.add(s);
            }
            
        } catch (Exception e) {
        }
        
        return sales;
    }


    public int addSale(Sale s) {
        
        String SQL = "INSERT INTO sales (CLIE_Code,USER_Code,SALE_Serial,SALE_Date,SALE_Total,SALE_Flag) VALUES (?,?,?,?,?,?)";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, s.getIdClient());
            ps.setInt(2, s.getIdUser());
            ps.setString(3, s.getSerial());
            ps.setString(4, s.getDate());
            ps.setFloat(5, s.getTotal());
            ps.setBoolean(6, s.getState());
            
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return r;
    }


    public int updateSale(Sale s) {
        
        String SQL = "UPDATE sales SET CLIE_Code=?,USER_Code=?,SALE_Serial=?,SALE_Date=?,SALE_Total=?,SALE_Flag=? WHERE SALE_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, s.getIdClient());
            ps.setInt(2, s.getIdUser());
            ps.setString(3, s.getSerial());
            ps.setString(4, s.getDate());
            ps.setFloat(5, s.getTotal());
            ps.setBoolean(6, s.getState());
            ps.setInt(7, s.getId());
            
            r = ps.executeUpdate();
        } catch (Exception e) {
        }
        
        return r;
    }


    public void deleteSale(int id) {
        String SQL = "DELETE FROM sales WHERE SALE_Code=?";
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);            
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    } 
    
    
    public int addDetailSale(DetailSale ds) {
        int r = 0;
        
        String SQL = "INSERT INTO detail_sales (PROD_Code,SALE_Code,DETA_Qty,DETA_Subtotal) VALUES (?,?,?,?)";
        
        try {
            con = cx.Connect();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, ds.getIdProduct());
            ps.setInt(2,ds.getIdSale());
            ps.setInt(3, ds.getQty());
            ps.setFloat(4, ds.getSubtotal());
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return r;
    }
    
    
}
