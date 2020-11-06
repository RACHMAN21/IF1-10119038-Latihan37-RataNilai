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
 * Deskripsi Program : program ini berisi class Rata Nilai
 * 
 */

public class RataRataNilai {
    private double rata = 0;
    
    private double hitungRataNilai(int[] nilai) {
        for(int i : nilai) {
            rata += i;
        }
        return rata = rata / nilai.length;
    }
    
    public void tampilRataNilai(int[] nilai) {
        hitungRataNilai(nilai);
        System.out.println("Rata-Rata Nilainya Adalah "+rata);
    }
}