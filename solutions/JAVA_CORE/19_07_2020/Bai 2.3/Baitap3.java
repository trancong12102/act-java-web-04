/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap3 {

    public static void main(String[] agrs) {
        int a[][] = new int[3][3];
        boolean result = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("nhap phan tu a[%d][%d]:", i, j);
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
                if (i == j && a[i][j] != 1) {
                    result = false;

                    break;
                }
            }
        }

        if (result) {
            System.out.println("day la ma tran don vi");
        } else {
            System.out.println("day khong phai ma tran don vi");
        }
        result = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != 0) {
                    result = false;
                }

            }

        }
        if (result) {
            System.out.println("day la ma tran 0");
        } else {
            System.out.println("khong phai ma tran 0");
        }
        result = true;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != a[j][i]) {
                    result = false;
                }

            }

        }
        if (result) {
            System.out.println("day la ma tran doi xung");
        } else {
            System.out.println("khong phai ma tran doi xung");
        }
    }

}
