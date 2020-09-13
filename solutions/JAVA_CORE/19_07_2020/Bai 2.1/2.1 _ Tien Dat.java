/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_mang_2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_1_Mang_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int [3][3];
        
        System.out.println("--- Nhap cac phan tu cua ma tran ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println("--- Ma tran vua nhap ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("%d\t",A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        int[] sumCol = new int[3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                sumCol[j] += A[i][j]; 
            }
        }
        for (int i = 0; i < A.length; i++) {
                System.out.printf("Tong cot %d > %d \n",i+1,sumCol[i]);
        }
        System.out.print("\n");
        
        int[] sumRow = new int[3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                sumRow[j] += A[j][i]; 
            }
        }
        for (int i = 0; i < A.length; i++) {
                System.out.printf("Tong hang %d > %d \n",i+1,sumRow[i]);
        }
    }
}
