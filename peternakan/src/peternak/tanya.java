/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternak;

/**
 *
 * @author acer
 */
public class tanya extends peternak {
  int idTanya;
  String pertanyaan, kategori, waktu, status;
  
  public tanya(){}
  
  public tanya(int idTanya, String pertanyaan, String kategori, String waktu, String status) {
        this.idTanya = idTanya;
        this.pertanyaan = pertanyaan;
        this.kategori = kategori;
        this.waktu = waktu;
        this.status = status;
    }

 public void inputIdTanya(int idTanya) {
        this.idTanya = idTanya;
    }

    public int ambilIdTanya() {
        return this.idTanya;
    }

    public void inputPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    public String ambilPertanyaan() {
        return this.pertanyaan;
    }

    public void inputKategori(String kategori) {
        this.kategori = kategori;
    }

    public String ambilKategori() {
        return this.kategori;
    }

    public void inputWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String ambilWaktu() {
        return this.waktu;
    }

    public void inputStatus(String status) {
        this.status = status;
    }

    public String ambilStatus() {
        return this.status;
    }   
}
