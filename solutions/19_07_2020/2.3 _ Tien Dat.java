/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3_mang_2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_3_Mang_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] A = new int [3][3];
        
        System.out.println("--- Nhap ma tran A ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println("--- Ma tran A vua nhap ---");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("%d\t",A[i][j]);
            }
            System.out.print("\n");
        }
        
        boolean flag1 = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i ==j && A[i][j] != 1){
                    flag1 = false;
                } else if ( i != j && A[i][j] != 0) {
                    flag1 = false;
                }
            }
        }
        if (flag1 == false) {
            System.out.println("> Ma tran A khong la ma tran don vi !");
        } else {
            System.out.println("> Ma tran A la ma tran don vi !");
        }
        
        boolean flag2 = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != 0){
                    flag2 = false;
                } 
            }
        }
        if (flag2 == false) {
            System.out.println("> Ma tran A khong la ma tran 0 !");
        } else {
            System.out.println("> Ma tran A la ma tran 0 !");
        }
        
        boolean flag3 = true;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] != A[j][i]){
                    flag3 = false;
                } 
            }
        }
        if (flag3 == false) {
            System.out.println("> Ma tran A khong la ma tran doi xung !");
        } else {
            System.out.println("> Ma tran A la ma tran doi xung !");
        }
    }
}
