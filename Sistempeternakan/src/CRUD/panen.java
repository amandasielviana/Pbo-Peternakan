/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author asus
 */
public class panen {
    private String databaseName = "gustiamandasielviana_2210010209";
    private String username = "root";
    private String password = "";
    public static Connection connectiondb;

    public panen(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectiondb = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void simpanpanen (String id_panen, String id_pembibitan, String tgl_panen, String harga, String total) {
        try {
            String sql = "insert into uji (id_panen, id_pembibitan, tgl_panen, harga, total) value (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_panen);
            perintah.setString(2, id_pembibitan);
            perintah.setString(3, tgl_panen);
            perintah.setString(4, harga);
            perintah.setString(5, total);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public void ubahpanen (String id_panen, String id_pembibitan, String tgl_panen, String harga, String total) {
try {
            String sql = "update uji set nama id_panen = ?, id_pembibitan = ?, tgl_panen = ?, harga = ?, where total = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_panen);
            perintah.setString(2, id_pembibitan);
            perintah.setString(3, tgl_panen);
            perintah.setString(4, harga);
             perintah.setString(5, total);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
        
    public void hapuspanen (String id_panen, String id_pembibitan, String tgl_panen, String harga, String total) {
        try {
            String sql = "delete from uji where total = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(5, total);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
