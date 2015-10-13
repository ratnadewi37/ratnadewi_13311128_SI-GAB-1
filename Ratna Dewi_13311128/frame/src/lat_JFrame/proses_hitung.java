/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lat_JFrame;

/**
 *
 * @author User
 */
public class proses_hitung {
   //Deklarasikan Variabel
    int x, y, hasil_penjumlahan;
    int hasil_perkurangan, hasil_perkalian;
    float hasil_pembagian;
    //buat methode penjumlahan
    public void proses_jumlah(){
        hasil_penjumlahan = x + y;
    }
    public void proses_kurang(){
        hasil_perkurangan = x - y;  
    }
    public void proses_bagi(){
        hasil_pembagian = (float)x/y;    
    }
    public void proses_kali(){
        hasil_perkalian = x*y;
    }
}
