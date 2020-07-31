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
public class b1 {
    public static void main(String[] args) {
        //khoi tao mang, nhap gia tri
        int [][] arr = new int[3][3];
        System.out.println("nhap gia tr mang 3x3");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                
            }
            
        }
        //inm nag vua nhap
        System.out.println("gia tri mang vuan hap");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]);
                                          
            }
             System.out.println("");
            
        }
         
         //tong moi hang
                 int x=0, y=0, z=0;
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                if (i==1){
                    y+=arr[i][j];
                }
                else if(i==0){
                    x+=arr[i][j];
                }
                else{
                    z+=arr[i][j];
                }
                
            }
        }
        System.out.println("tong hang 1 la: "+x);
        System.out.println("tong hang 2 la: "+y);
        System.out.println("tong hang 3 la: "+z);
        
        //tong moi cot
            int m=0, n=0, q=0;
        for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                if (j==1){
                    m+=arr[i][j];
                }
                else if(j==0){
                    n+=arr[i][j];
                }
                else{
                    q+=arr[i][j];
                }
                
            }
        }
        System.out.println("tong cot 1 la: "+n);
        System.out.println("tong cot 2 la: "+m);
        System.out.println("tong cot 3 la: "+q);
        
        
    }
}
