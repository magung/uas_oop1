/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apoteknusantara;

/**
 *
 * @author PLJC-PC
 */
public class datasupplier {
    int id_supplier;
    String nama, alamat, telepon;

    public datasupplier(int id_supplier, String nama, String alamat, String telepon) {
        this.id_supplier = id_supplier;
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public int getId_supplier() {
        return id_supplier;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelepon() {
        return telepon;
    }
    
    
    
    
}
