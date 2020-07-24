/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_2;

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
        System.out.println("Nhap ma tran thu 1:");
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
        System.out.println("Nhap ma tran thu 2:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\nA[" + i + "][" + j + "] = ");
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("tong 2 ma tran la:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int d[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int l = 0; l < 3; l++) {
                    d[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        System.out.println("tich 2 ma tran la:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(d[i][j] + "\t");
            }
            System.out.println("\n");
        }
        int det1 = a[1][1] * a[2][2] * a[3][3] + a[1][2] * a[2][3] * a[3][1] + a[1][3] * a[2][1] * a[3][2]
                - a[3][1] * a[2][2] * a[1][1] - a[3][2] * a[2][3] * a[1][1] - a[3][3] * a[2][1] * a[1][2];
        System.out.println("Dinh thuc cua ma tran 1 la: " + det1);
    }

}
