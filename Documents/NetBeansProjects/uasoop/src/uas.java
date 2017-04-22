/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rico
 */
import java.util.Scanner;
public class uas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        String nama , nim , mata_kuliah ;
        char grade ;
        final double nilai;
        System.out.println("=====**Nilai Mahasiswa**=====\n");
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Masukan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukan Mata Kuliah : ");
        mata_kuliah = input.nextLine();
        System.out.print("Masukan Nilai : ");
        nilai = input.nextInt();
        if (nilai >= 80 && nilai <=100){
            grade = 'A';
        }
        else if (nilai > 70 && nilai < 80){
            grade = 'B';
        }
        else if (nilai > 60 && nilai < 70){
            grade = 'C';
        }
        else if (nilai > 50 && nilai < 60){
            grade = 'D';
        }
        else if (nilai < 50 ){
            grade = 'E';
        }
        else {
            grade = 'F';
        }
            System.out.println("\nNIM : "+nim+" Dengan Nama "+nama+", Pada Mata Kuliah "+mata_kuliah+", Memiliki Nilai "+nilai+" = ("+grade+")"+""
                    );

    }
    }
