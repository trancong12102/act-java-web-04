/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap so a: ");
        a = sc.nextInt();
        System.out.println("Nhap so b: ");
        b = sc.nextInt();
        System.out.println("Uoc chung lon nhat cua " + a + " " + b + " la: " + UCLN(a, b));
        System.out.println("Boi chung nho nhat cua " + a + " " + b + " la: " + (a*b)/(UCLN(a, b)));

    }

    public static int UCLN(int a, int b) {
        int c = 0;
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                c = i;
            }
        }
        return c;

    }
}
