/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_2_chieu;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class b2 {
    public static void main(String[] args) {
        int [][] arr = new int[3][3];
          int [][] brr = new int[3][3];
            int [][] crr = new int[3][3];
            
        System.out.println("nhap gia tr mang A");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }
        
         System.out.println("nhap gia tr mang B");     
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                brr[i][j] = sc.nextInt();
                
            }
            
        }
                  System.out.println("gia tri mang A vuan hap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                                          
            }
             System.out.println("");
            
        }
                 System.out.println("gia tri mang B vuan hap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(brr[i][j]);
                                          
            }
             System.out.println("");
            
        }
        
        //tong hai mang
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                crr[i][j] = arr[i][j]+brr[i][j];
                
            }
        }
                  System.out.println("gia tri mang A vuan hap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                                          
            }
             System.out.println("");
            
        }
                 System.out.println("gia tri tong hai mang vua nhap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(crr[i][j]);
                System.out.print("");
                                          
            }
             System.out.println("");
            
        }
        
        //tich hai ma tran
        for (int i = 0; i < 3; i++) {
            for (int k = 0;  k < 3; k++) {
                crr[i][k] = 0;
                for(int j = 0; j<3 ; j++){
                 crr[i][k] = crr[i][k] + arr[i][j]*brr[j][k];
                }
            }
        }
               System.out.println("gia tri tich hai mang vuan hap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(crr[i][j]);
                System.out.print("");
                        
                                          
            }
             System.out.println("");
            
        }
    }
}
