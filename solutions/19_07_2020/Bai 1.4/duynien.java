/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class mang1chieu4 {

    public static void main(String[] args) {
        int temp,demc=0,deml=0;
        int a[] = new int[15];
        System.out.println("day so random:");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "   ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nday so tang dan`:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        } for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\nday so giam dan`:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
            demc++;
        }
        System.out.println("\nso phan tu chan = "+demc);
         for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0)
            deml++;
        }
        System.out.println("so phan tu le = "+deml);
    }
}
