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
public class matran1 {

    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int hang1 = 0, hang2 = 0, hang3 = 0;
        int cot1 = 0, cot2 = 0, cot3 = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("nhap  phan tu a[%d][%d]:", i, j);
                a[i][j] = new Scanner(System.in).nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + "  ");
            }
            System.out.println("  ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == 0) {
                    hang1 += a[i][j];
                }
                if (i == 1) {
                    hang2 += a[i][j];
                }
                if (i == a.length - 1) {
                    hang3 += a[i][j];
                }
                if (j == 0) {
                    cot1 += a[i][j];
                }
                if (j == 1) {
                    cot2 += a[i][j];
                }
                if (j == a.length - 1) {
                    cot3 += a[i][j];
                }
            }
        }

        System.out.println("tong hangg 1:" + hang1);
        System.out.println("tong hangg 2:" + hang2);
        System.out.println("tong hangg 3:" + hang3);
        System.out.println("tong cot 1: " + cot1);
        System.out.println("tong cot 2: " + cot2);
        System.out.println("tong cot 3: " + cot3);
    }
}
