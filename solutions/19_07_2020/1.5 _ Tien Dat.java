/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5_mang_1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_5_Mang_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        
        System.out.print("Nhap vecto a > ");
        for (int i = 0; i < A.length; i++){
            A[i] = input.nextInt();
        }
        
        System.out.print("Nhap vecto b > ");
        for (int i = 0; i < B.length; i++){
            B[i] = input.nextInt();
        }
        
        int[] C = new int[3];
        for (int i = 0; i < C.length; i++){
            C[i] = A[i] + B[i];
        }
        System.out.print("Tong hai vecto >");
        for (int i = 0; i < C.length; i++){
            System.out.printf(" %d",C[i]); 
        }
        System.out.print("\n");
        
        int Scalar = 0;
        for (int i = 0; i < C.length; i++){
            Scalar += A[i]*B[i];
        }
        System.out.printf("Tich vo huong cua 2 vecto > %d \n", Scalar);
    }
}
