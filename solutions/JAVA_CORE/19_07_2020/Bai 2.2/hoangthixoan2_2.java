/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1.pkg1;

import static java.awt.PageAttributes.MediaType.A;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.A;

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
        System.out.print("Nhap so ma tran la: ");
        int n = Integer.parseInt(sc.nextLine());

        int[][] A = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" A[%d][%d] = ", i, j);
                A[i][j] = sc.nextInt();

            }

        }

        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(" B[%d][%d] =", i, j);
                B[i][j] = sc.nextInt();

            }

        }
        // in ra ma tran A
        System.out.println("Ma tran A:");
         for (int i = 0; i < 3; i++) {
           for (int j = 0; j < 3; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    } 
         // in ra ma tran B
        System.out.println("Ma tran B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(B[i][j] + "\t");
                
            } 
            System.out.print("\n");
            
        }
        // tong cua 2 ma tran
        int C[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = B[i][j] + A[i][j];
               

            }

        }
        // hien thi tong cua 2 ma tran
        System.out.println("Tong cua 2 ma tran la C :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
                
            }
            System.out.print("\n");
         
        }
        // tich cua 2 ma tran
        int D[][] = new int [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                D[i][j]=0;
                for (int k = 0; k < 3; k++) {
                   D[i][j] = D[i][j]+ A[i][k]*B[k][j]; 
                }
                           
            }
            
        }
        // In ma tran tich
        System.out.println("Tich cua 2 ma tran :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(D[i][j] +"\t" );
                
            }
            System.out.print("\n");
        }
        
        
            
        }
        
        

    }


