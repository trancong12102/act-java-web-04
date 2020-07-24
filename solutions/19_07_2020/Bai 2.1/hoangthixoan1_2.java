/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main11;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d]= ", i, j);
                A[i][j] = sc.nextInt();

            }

        }
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("B[%d][%d]= ", i, j);
                B[i][j] = sc.nextInt();

            }

        }
        //In ma tran A
        System.out.println("Ma tran A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(A[i][j]+ "\t");
                
            }
            System.out.print("\n");
            
        }
        // in ma tran B
        System.out.println("Ma tran B");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) { 
                System.out.print(B[i][j]+"\t");
                
                
                
            }
            System.out.print("\n");
            
        }
        int[] sColA = new int [3];
        int[] sColB = new int [3]; 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sColA[j] += A[i][j];
                sColB[j] += B[i][j];
            }
            
        }
        for (int i = 0; i<3 ; i++) {
            System.out.printf("Tong cot cua ma tran A la cot %d : %d\n", i+1,sColA[i]);
            System.out.printf("Tong cot cua ma tran B la cot %d : %d\n ", i+1,sColB[i]);
            
        }
        int[] sRowA = new int[3];
        int[] sRowB = new int[3];
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                sRowA[j] += A[j][i];
                sRowB[j] += B[j][i];
                
            }
            
        }
        for (int i = 0; i < 3; i++) {
            System.out.printf("Tong hang cua ma tran A la hang %d : %d\n ",i+1,sRowA[i]);
            System.out.printf("Tong hang cua ma tran B la hang %d : %d\n ",i+1,sRowB[i]);
            
            
        }
                
    }

}
