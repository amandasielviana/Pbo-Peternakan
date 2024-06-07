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

public class pembayaran {
    
    private String databaseName = "gustiamandasielviana_2210010209";
    private String username = "root";
    private String password = "";
    public static Connection connectiondb;

    public pembayaran(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectiondb = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void simpanpembayaran (String id_pembayaran, String kd_pesan, String total_bayar, String tgl_bayar, String foto) {
        try {
            String sql = "insert into uji (id_pembayaran, kd_pesan, total_bayar, tgl_bayar, foto) value (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_pembayaran);
            perintah.setString(2, kd_pesan);
            perintah.setString(3, total_bayar);
            perintah.setString(4, tgl_bayar);
            perintah.setString(5, foto);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public void ubahpembayaran(String id_pembayaran, String kd_pesan, String total_bayar, String tgl_bayar, String foto) {
try {
            String sql = "update uji set nama id_pembayaran = ?, kd_pesan = ?, total_bayar = ?, tgl_bayar = ?, where foto = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_pembayaran);
            perintah.setString(2, kd_pesan);
            perintah.setString(3, total_bayar);
            perintah.setString(4, tgl_bayar);
             perintah.setString(5, foto);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
        
    public void hapuspembayaran (String id_pembayaran, String kd_pesan, String total_bayar, String tgl_bayar, String foto) {
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
