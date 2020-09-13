/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2c_mang_2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_2c_Mang_2 {

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
        
        int det = A[0][0]*A[1][1]*A[2][2] + A[2][0]*A[0][1]*A[1][2] + A[0][2]*A[1][0]*A[2][1] - A[0][2]*A[1][1]*A[2][0] - A[2][2]*A[1][0]*A[0][1] - A[0][0]*A[2][1]*A[1][2];
        System.out.printf("> Dinh thuc cua ma tran = %d\n", det);
    }
}
