/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan36.objectorientedtargetsaldotabungan;

import data.Tabungan;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menghitung target saldo tabungan
 */
public class PBOIF210119064Latihan36ObjectOrientedTargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //inisialisasi objek tabungan
        Tabungan t = new Tabungan();
        
        t.setSaldoAwal(3500000);
        t.setSaldoTarget(6000000);
        t.setBunga(8);
        
        //output
        t.hitungTarget();
        
    }
    
}
