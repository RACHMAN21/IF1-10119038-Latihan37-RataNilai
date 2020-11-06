/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.latihan37.ratanilai;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : program ini berisi untuk menampilkan hasil nilai rata-rata
 * 
 */

import java.util.Scanner;

public class Tester {
    static Scanner sc = new Scanner(System.in);
    private static int nilaiMhs[];
    
    private static int masukkanJumlah() {
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        return sc.nextInt();
    }
    
    private static void masukkanNilai() {
        int jumlah = masukkanJumlah();
        nilaiMhs = new int[jumlah];
        for(int i=0;i<jumlah;i++) {
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }
    }
    
    public static void main(String[] args) {
        RataRataNilai nilai = new RataRataNilai();
        masukkanNilai();
        nilai.tampilRataNilai(nilaiMhs);
        System.out.println("Developed by : Rachman Aldiansyah");
    }
}