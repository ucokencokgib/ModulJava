/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;

/**
 *
 * @author ASUS
 */
public class Bab7soal2 {

    public static void main(String[] args) {
        String nim = "1111111";
        String nama = "Agustav";
        int tahun = 3;
        char peminatan = 'M'; // Pilihan peminatan: M untuk Pemograman Mobile, J untuk java
        
        // Menampilkan input yang ditetapkan
        System.out.println("### Pendataan Mahasiswa ###");
        System.out.println("NIM : " + nim);
        System.out.println("NAMA : " + nama);
        System.out.println("TAHUN : " + tahun);
        System.out.println("PILIH PEMINATAN : " + peminatan);
        
        // Menentukan output berdasarkan pilihan peminatan
        System.out.println("\noutput : ");
        switch (peminatan) {
            case 'M':
                System.out.println("PEMOGRAMAN MOBILE, PEMOGRAMAN JAVA 2");
                break;
            case 4:
                switch ( peminatan ) {
                    case 'C':
                        System.out.println("KOMUNIKASI DATA, MULTIMEDIA");
                        break;
                    case 'E':
                        System.out.println("SISTEM TERDISTRIBUSI, IMAGE PROCESSING");
                        break;
                    case 'M':
                        System.out.println("SIM, sistem jaringan");
                        break;
                }
                        break;
        }
    }
    
}