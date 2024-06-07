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
public class kandang {
    
    private String databaseName = "gustiamandasielviana_2210010209";
    private String username = "root";
    private String password = "";
    public static Connection connectiondb;

    public kandang(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectiondb = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void simpankandang (String id_kandang, String id_peternak, String id_pegawai, String jenis_kandang, String luas_kandang) {
        try {
            String sql = "insert into uji (id_kandang, id_peternak, id_pegawai, jenis_kandang, luas_kandang) value (?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_kandang);
            perintah.setString(2, id_peternak);
            perintah.setString(3, id_pegawai);
            perintah.setString(4, jenis_kandang);
            perintah.setString(5, luas_kandang);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public void ubahkandang (String id_kandang, String id_peternak, String id_pegawai, String jenis_kandang, String luas_kandang) {
    try {
            String sql = "update uji set nama id_kandang = ?, id_peternak = ?, id_pegawai = ?, jenis_kandang = ?, where luas_kandang = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_kandang);
            perintah.setString(2, id_peternak);
            perintah.setString(3, id_pegawai);
            perintah.setString(4, jenis_kandang);
             perintah.setString(5, luas_kandang);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
        
    public void hapuskandang (String id_kandang, String id_peternak, String id_pegawai, String jenis_kandang, String luas_kandang) {
        try {
            String sql = "delete from uji where luas_kandang = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(5, luas_kandang);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
