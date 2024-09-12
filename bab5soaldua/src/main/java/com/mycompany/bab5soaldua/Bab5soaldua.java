/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soaldua;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Bab5soaldua {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("###Pendataan Karyawan PT. Petani kode ### ");
        // Meminta pengguna untuk memasukkan nama
        System.out.print("Nama Karyawan : ");
        String nama = scanner.nextLine();
        
        // Meminta pengguna untuk memasukkan umur
        System.out.print("Alamat : ");
        String alamat = scanner.nextLine();
        System.out.print("Usia : ");
        int usia = scanner.nextInt();
        System.out.print("Gaji : ");
        int gaji = scanner.nextInt();
        
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Gaji : " + "Rp " + gaji);
        
        // Menutup scanner
        scanner.close();
    }
    
}