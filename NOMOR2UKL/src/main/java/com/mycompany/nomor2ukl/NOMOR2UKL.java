/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomor2ukl;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class NOMOR2UKL {

    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.println("Masukan nilai Maksimal:");
        int n = input.nextInt();
        System.out.println("Masukan nilai Minimal:");
        int m = input.nextInt();
        
        for (int i = m; i <= n ; i++) {

            System.out.print(i + ". ");

            if (i == 1) {
                System.out.println("saya senang");
            } else if (i % 3 == 2) {
                System.out.println("saya anak moklet");
            } else if (i % 3 == 1) {
                System.out.println("saya anak wikusama");
            } else { // i % 3 == 0
                System.out.println("saya angkatan 34");
            }
        }
    }
}