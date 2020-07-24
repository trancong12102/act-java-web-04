/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_mang_2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_2_Mang_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int [3][3];
        int[][] B = new int [3][3];
        int[][] C = new int [3][3];
        
        System.out.println("--- Nhap ma tran A ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println("--- Nhap ma tran B ---");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.printf("B[%d][%d] = ",i,j);
                B[i][j] = input.nextInt();
            }
        }
        
        System.out.println("--- Ma tran A vua nhap ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("%d\t",A[i][j]);
            }
            System.out.print("\n");
        }
        
        System.out.println("--- Ma tran B vua nhap ---");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                System.out.printf("%d\t",B[i][j]);
            }
            System.out.print("\n");
        }
        
        System.out.println("> Tong hai ma tran: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.printf("%d\t",C[i][j]);
            }
            System.out.print("\n");
        }
        
        System.out.println("> Tich hai ma tran: ");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < A.length; k++){
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                System.out.printf("%d\t",C[i][j]);
            }
            System.out.print("\n");
        }       
    }
}
