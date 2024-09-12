/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12soal1;

/**
 *
 * @author ASUS
 */
public class Bab12soal1 extends pegawai{
    
    int bonus = 1000000;
    int gajiTotal = gaji + bonus + tunjanganMakan + transport;
    public static void main(String[] args) {
        Bab12soal1 sa = new Bab12soal1();
        System.out.println("Gaji SystemAnalyst : "+ sa.gaji);
        System.out.println("Bonus : " + sa.bonus);
        System.out.println("Tunjangan makan : " + sa.tunjanganMakan);
        System.out.println("Transport : " + sa.transport);
        System.out.println("Gaji Total : " + sa.gajiTotal);
    }
}
