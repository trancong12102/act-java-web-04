/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class mang1chieu2 {

    public static void main(String[] args) {
        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu:");
            a[i] = new Scanner(System.in).nextInt();

        }
        int max = 0, min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print("so phan tu chia het cho 3:");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0)
                System.out.print(a[i]+"  ");
        }
        System.out.println("\nmax="+max);
        System.out.println("min="+min);
    }
}
