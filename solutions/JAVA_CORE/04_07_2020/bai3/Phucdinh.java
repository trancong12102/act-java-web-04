/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg2;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, dem =0, i, j, flag;
        Scanner Ktra = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n= Ktra.nextInt();
        System.out.println(n + " so nguyen to dau la: ");
        for (j = 2;; j++) {
            flag = 0;
            for (i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                System.out.println(j + " ");
                dem++;
            }
            if (dem == n) {
                break;
            }
        }
    }
}

    

// TODO code application logic here
       // Scanner input = new Scanner(System.in);
        //System.out.println("Nhap n:");
        //int n = input.nextInt();
        