/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab2soalsatu;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class Bab2soalsatu {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("### Operator Mencari Luas Segitiga ###");
        System.out.println("Masukan nilai alas :");
        double alas = scanner.nextDouble();
        System.out.println("Masukan nilai tinggi : ");
        double tinggi = scanner.nextDouble();
        
        double luas = (alas * tinggi)/2;
        
        System.out.println("Luas Segitiga : " + luas);
        
        // Menutup scanner
        scanner.close();
       
    }
}