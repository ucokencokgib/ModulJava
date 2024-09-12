/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Bab9soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan bilangan awal : ");
        int bilanganawal = scanner.nextInt();
        System.out.println("masuka  bilangan akhir : ");
        int bilanganakhir = scanner.nextInt();
        while (bilanganawal < bilanganakhir) {
        bilanganawal += 5;
        System.out.println(bilanganawal + ",");
        }
    }
}
