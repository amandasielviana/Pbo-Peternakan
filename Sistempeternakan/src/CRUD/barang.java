/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author asus
 */
public class barang {
    
    private String databaseName = "gustiamandasielviana_2210010209";
    private String username = "root";
    private String password = "";
    public static Connection connectiondb;

    public barang(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectiondb = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void simpanbarang (String kd_barang, String nm_barang, String harga, String stok, String foto) {
        try {
            String sql = "insert into uji (kd_barang, nm_barang, harga, stok, foto) value (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, kd_barang);
            perintah.setString(2, nm_barang);
            perintah.setString(3, harga);
            perintah.setString(4, stok);
            perintah.setString(5, foto);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public void ubahbarang (String kd_barang, String nm_barang, String harga, String stok, String foto) {
try {
            String sql = "update uji set nama kd_barang = ?, nm_barang = ?, harga = ?, stok = ?, where foto = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, kd_barang);
            perintah.setString(2, nm_barang);
            perintah.setString(3, harga);
            perintah.setString(4, stok);
             perintah.setString(5, foto);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
        
    public void hapusbarang (String kd_barang, String nm_barang, String harga, String stok, String foto) {
        try {
            String sql = "delete from uji where foto = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(5, foto);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
