/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Bab11soal2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("ID Karyawan");
        int id = myInput.nextInt();
        myInput.nextLine();
        
        System.out.println("Nama Karyawan : ");
        String nama = myInput.nextLine();
        
         System.out.println("gol : ");
         int gol = myInput.nextInt();
         
         String jabatan = "";
         int gajiPokok = 0 ;
         
         System.out.println("...............");
         
         
         switch(gol){
             case 1: 
                 jabatan = "Asisten";
                 gajiPokok = 2500000;
                 break;
             case 2 :
                 jabatan = "karyawan";
                 gajiPokok = 2000000;
             case 3 : 
                 jabatan = "maneger";
                 gajiPokok= 4000000;
             
         }
         karyawan karyawan1 = new karyawan();
         karyawan1.setKaryawan(id, nama, nama, jabatan, gajiPokok);
         karyawan1.getKarayawan();
    }
     
}
