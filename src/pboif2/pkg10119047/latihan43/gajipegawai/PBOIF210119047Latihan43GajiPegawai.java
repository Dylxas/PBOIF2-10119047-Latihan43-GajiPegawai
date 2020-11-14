/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan43.gajipegawai;

import data.GajiPegawai;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM MENGHITUNG GAJI PEGAWAI
 */

public class PBOIF210119047Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GajiPegawai gajipegawai = new GajiPegawai();
        
        gajipegawai.setNama("Rizki Adam Kurniawan");
        gajipegawai.setAlamat("Jalan Semar dlm 4 No 72/66");
        gajipegawai.setUangTransport(250000);
        gajipegawai.setUangTunjangan(300000);
        gajipegawai.setGajiPokok(4500000);
        gajipegawai.setTotalGaji(gajipegawai.totalGaji(gajipegawai.getUangTunjangan(),
                                                       gajipegawai.getUangTransport(),
                                                       gajipegawai.getGajiPokok()));
        gajipegawai.tampilData(gajipegawai.getNama(), 
                               gajipegawai.getAlamat(), 
                               gajipegawai.getUangTunjangan(), 
                               gajipegawai.getUangTransport(), 
                               gajipegawai.getGajiPokok(),
                               gajipegawai.getTotalGaji());
    }
    
}
