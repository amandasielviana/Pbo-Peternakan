/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import static CRUD.barang.connectiondb;
import static CRUD.database.connectiondb;
import static CRUD.kandang.connectiondb;
import static CRUD.panen.connectiondb;
import static CRUD.pembayaran.connectiondb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
/**
 *
 * @author asus
 */
public class database {
    private String databaseName = "2210010209_gustiamanda";
    private String username = "root";
    private String password = "";
    public static Connection connectiondb;

    public database(){
        try {
            String location = "jdbc:mysql://localhost/"+ databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectiondb = DriverManager.getConnection(location, username, password);
            System.out.println("database terkoneksi");    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void simpanuji (String nik, String nama, String telp, String Alamat) {
        try {
            String sql = "insert into uji (nik, nama, telp, Alamat) value (?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, Alamat);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public void ubahuji (String nik, String nama, String telp, String Alamat) {
try {
            String sql = "update uji set nama = ?, telp = ?, Alamat=? where nik = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, nik);
            perintah.setString(2, nama);
            perintah.setString(3, telp);
            perintah.setString(4, Alamat);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       
        
    public void hapusuji (String nik) {
        try {
            String sql = "delete from uji where nik = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, nik);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
               
//Tabel barang
        public void simpanbarang (String kd_barang, String nm_barang, String harga, String stok) {
        try {
            String sql = "insert into uji (kd_barang, nm_barang, harga, stok) value (?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, kd_barang);
            perintah.setString(2, nm_barang);
            perintah.setString(3, harga);
            perintah.setString(4, stok);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
        public void ubahbarang (String kd_barang, String nm_barang, String harga, String stok) {
        try {
            String sql = "update uji set nama kd_barang = ?, nm_barang = ?, harga = ?,  where stok = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, kd_barang);
            perintah.setString(2, nm_barang);
            perintah.setString(3, harga);
            perintah.setString(4, stok);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
       public void hapusbarang (String kd_barang) {
        try {
            String sql = "delete from barang where kd_barang = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, kd_barang);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

 //Tabel kandang
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
          public void hapuskandang (String luas_kandang) {
        try {
            String sql = "delete from kandang where luas_kandang = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(5, luas_kandang);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//Tabel panen
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
            
            public void hapuspanen (String total) {
        try {
            String sql = "delete from panen where total = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(5, total);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
//Tabel pembayaran
            public void simpanpembayaran (String id_pembayaran, String kd_pesan, String total_bayar, String tgl_bayar) {
        try {
            String sql = "insert into uji (id_pembayaran, kd_pesan, total_bayar, tgl_bayar, foto) value (?, ?, ?, ?)";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_pembayaran);
            perintah.setString(2, kd_pesan);
            perintah.setString(3, total_bayar);
            perintah.setString(4, tgl_bayar);
            perintah.executeUpdate();
            System.out.println("data berhasil disimpan");
         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
            public void ubahpembayaran(String id_pembayaran, String kd_pesan, String total_bayar, String tgl_bayar) {
        try {
            String sql = "update uji set nama id_pembayaran = ?, kd_pesan = ?, total_bayar = ?, where tgl_bayar = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_pembayaran);
            perintah.setString(2, kd_pesan);
            perintah.setString(3, total_bayar);
            perintah.setString(4, tgl_bayar);
            
            perintah.executeUpdate();
            System.out.println("data berhasil diubah");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
           
            public void hapuspembayaran (String id_pembayaran) {
        try {
            String sql = "delete from pembayaran where id_pembayaran = ?";
            PreparedStatement perintah = connectiondb.prepareStatement(sql);
            perintah.setString(1, id_pembayaran);
            
            perintah.executeUpdate();
            System.out.println("data berhasil dihapus");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}