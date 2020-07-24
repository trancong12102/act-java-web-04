/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_1;

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
        int hang[] = new int[3];
        int cot[] = new int[3];
        for (int i = 0; i < 3; i++) {
            hang[i] = 0;
            cot[i] = 0;
            for (int j = 0; j < 3; j++) {
                hang[i] += a[i][j];
                cot[i] += a[j][i];
            }

        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Tong hang " + i + " la:" + hang[i]);
            System.out.println("Tong cot " + i + " la:" + cot[i]);
        }
    }

}
