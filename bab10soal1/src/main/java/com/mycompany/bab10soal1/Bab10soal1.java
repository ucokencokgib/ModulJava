/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal1;

/**
 *
 * @author ASUS
 */
public class Bab10soal1 {

    public static void main(String[] args) {
       int a=5, b=3;
       aritmatika aritmatika1 = new aritmatika();
      aritmatika1.setTambah(a, b);
       System.out.println("a, b");
       System.out.println("bilangan 1 = " + a);
       System.out.println("bilangan 2 = " + b);
       System.out.println("Hasil Pertambahan" + aritmatika1.getAngka());
    }
}
