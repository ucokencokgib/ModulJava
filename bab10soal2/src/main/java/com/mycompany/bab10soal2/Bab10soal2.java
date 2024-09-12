/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10soal2;

/**
 *
 * @author ASUS
 */
public class Bab10soal2 {

    public static void main(String[] args) {
        int a=5, b=3;
        aritmatika aritmatika1 = new aritmatika();
        aritmatika1.setTambah(a, b);
        System.out.println("bilangan 1=" + a);
        System.out.println("bilangan 2=" + b);
        System.out.println("Hasil Pertambahan" + aritmatika1.getAngka());
        
        System.out.println("");
        aritmatika aritmatika2 = new aritmatika();
        aritmatika1.setPerkalian(a, b);
        System.out.println("bilangan 1=" + a);
        System.out.println("bilangan 2=" + b);
        System.out.println("Hasil Perkalian" + aritmatika2.getAngka());
        
       System.out.println("");
        aritmatika aritmatika3 = new aritmatika();
        aritmatika1.setPembagian(a, b);
        System.out.println("bilangan 1=" + a);
        System.out.println("bilangan 2=" + b);
        System.out.println("Hasil Pembagian" + aritmatika3.getAngka());
        
        System.out.println("");
        aritmatika aritmatika4 = new aritmatika();
        aritmatika1.setPerkalian(a, b);
        System.out.println("bilangan 1=" + a);
        System.out.println("bilangan 2=" + b);
        System.out.println("Hasil Perpangkatan" + aritmatika4.getAngka());
    }
}
