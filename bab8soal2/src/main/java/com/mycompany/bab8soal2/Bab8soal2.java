/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Bab8soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("TAHUN AKHIR?:");
        int AKHIR = input.nextInt();
        System.out.println("TAHUN AWAL?");
        int AWAL = input.nextInt();
        for (int tahun = AKHIR; tahun >= AWAL; tahun--){
        System.out.println(tahun);
        }
    }
}
