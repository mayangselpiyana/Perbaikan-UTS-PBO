/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunDatar;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang persegi panjang: ");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar persegi panjang: ");
        int lebar = input.nextInt();
        System.out.println("Masukkan jari-jari lingkaran: ");
        int jari = input.nextInt();
        
        PersegiPanjang persegi = new PersegiPanjang(panjang, lebar);
        Lingkaran lingkaran = new Lingkaran(jari);
        
        System.out.println("Luas daerah yang diarsir oleh setengah lingkaran adalah: " + (persegi.luas() - lingkaran.luas()));
    }
    
}
