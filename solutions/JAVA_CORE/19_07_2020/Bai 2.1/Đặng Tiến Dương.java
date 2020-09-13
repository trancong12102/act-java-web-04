/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2_1 {
    public static void main(String[] args) {
        int[][] A= new int[3][3];
        Scanner input=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Nhập phần tử thứ ["+i+","+j+"]:");
                A[i][j] = input.nextInt();
            }
        }
         System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print(A[i][j] + "\t");
        }System.out.print("\n");
    }System.out.print("\n");
      int[] sumCol = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumCol[j] += A[i][j]; 
            }
        }
        for (int i = 0; i < 3; i++) {
                System.out.printf("Tong cot %d : %d \n",i+1,sumCol[i]);
        }
        System.out.print("\n");
        
        int[] sumRow = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumRow[j] += A[j][i]; 
            }
        }
        for (int i = 0; i < 3; i++) {
                System.out.printf("Tong hang %d : %d \n",i+1,sumRow[i]);
    }
}
}