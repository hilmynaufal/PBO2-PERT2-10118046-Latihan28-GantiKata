/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pert2.pkg10118046.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 *  Nama              : M. Hilmy Naufal
 *  Kelas             : IF2
 *  NIM               : 10118046
 *  Deskripsi Program : mengganti kata dalam kalimat dengan kata yang diinginkan
 */
public class PBO2PERT210118046Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    
    public static void gantiKata(){
        System.out.println("======Program Mengganti Kata\n");
        System.out.print("Masukkan kalimat: ");
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        System.out.print("Ganti Kata: ");
        String kataDiganti = scanner.next();
        System.out.print("Menjadi Kata: ");
        String kataGanti = scanner.next();
        System.out.println("======Hasil Formatting======");
        System.out.println("Kalimat Awal: " + kalimat);
        
        kalimat = kalimat.replace(kataDiganti, kataGanti);
        System.out.println("Kalimat baru: " + kalimat);
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        gantiKata();
        System.out.println("Developed by: M. Hilmy Naufal");
    }

}
