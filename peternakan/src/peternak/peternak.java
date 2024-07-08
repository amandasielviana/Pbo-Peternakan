/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peternak;

/**
 *
 * @author acer
 */
public class peternak {
   String idPeternak,namaPeternak, alamat, email, password;
   
   public peternak(){}
   
   public peternak(String idPeternak, String namaPeternak, String alamat, String email, String password) {
        this.idPeternak = idPeternak;
        this.namaPeternak = namaPeternak;
        this.alamat = alamat;
        this.email = email;
        this.password = password;
    }
   
   public void inputIdPeternak(String idPeternak) {
        this.idPeternak = idPeternak;
    }

    public String ambilIdPeternak() {
        return this.idPeternak;
    }

    public void inputNamaPeternak(String namaPeternak) {
        this.namaPeternak = namaPeternak;
    }

    public String ambilNamaPeternak() {
        return this.namaPeternak;
    }

    public void inputAlamat(String alamat) {
       this.alamat = alamat;
    }

    public String ambilAlamat() {
        return this.alamat;
    }

    public void inputEmail(String email) {
        this.email = email;
    }

    public String ambilEmail() {
        return this.email;
    }

    public void inputPassword(String password) {
        this.password = password;
    }

    public String ambilPassword() {
        return this.password;
    }
}
