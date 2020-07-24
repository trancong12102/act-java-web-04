/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4;

import java.util.Random;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rd = new Random();
        int a[] = new int[15];
        for (int i = 0; i < 15; i++) {
            a[i] = rd.nextInt();
        }
                for (int i = 0; i < 15; i++) {
            System.out.println("a[" + i + "] = "+ a[i]);
        }
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 10; j++) {
                if (a[i] > a[j]) {
                    int tmp=a[i];
                    a[i] = a[j];
                    a[j]=tmp;
                }
            }
        }
        System.out.println("Mang sx tang la:");
        for (int i = 0; i < 15; i++) {
            System.out.println(a[i] + "\t");
        }
        System.out.println("Mang sx giam la:");
        for (int i = 14; i >= 0; i--) {
            System.out.println(a[i] + "\t");
        }
        int demc = 0;
        for (int i = 0; i < 15; i++) {
            if (a[i] % 2 == 0) {
                demc++;
            }
        }
        System.out.println("Tong cac phan tu chan la: " + demc);
        System.out.println("Tong cac phan tu le la: " + (15 - demc));
    }

}
