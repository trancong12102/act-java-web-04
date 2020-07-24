/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_3;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        System.out.println("Nhap ma tran:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\nA[" + i + "][" + j + "] = ");
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int check1 = 0, check0 = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    if (a[i][j] == 1) {
                        check1++;
                    }
                } else {
                    if (a[i][j] == 0) {
                        check0++;
                    }
                }
            }
        }
        if ((check1 == 3) && (check0 == 6)) {
            System.out.println("La ma tran don vi");
        } else {
            System.out.println("Khong la ma tran don vi");
        }
        int flag = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == 0) {
                    flag++;
                }
            }
        }
        if (flag == 9) {
            System.out.println("La ma tran 0");
        } else {
            System.out.println("Khong la ma tran 0");
        }
        int flagdx = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (a[i][j] == a[j][i]) {
                    flagdx++;
                }
            }
        }
        if (flagdx == 9) {
            System.out.println("La ma tran dx");
        } else {
            System.out.println("Khong la ma tran dx");
        }
    }

}
