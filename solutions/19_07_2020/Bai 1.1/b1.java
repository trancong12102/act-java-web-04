/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_1_chieu;

import java.util.Scanner;

/**
 *
 * @author Dung Ng//
 */
public class b1 {
    public static void main(String[] args) {
         int [] arr = new int [5];
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();           
        }
        float x = 0, y = 0, z = 0;
        for (int j = 0; j< arr.length; j++) {
             x+= arr[j];          
        }
        System.out.println("sum > "+x);
        for (int m = 0; m < arr.length; m++) {
            if(arr[m] %2==0){
                y+= arr[m];
            } 
        }
        for (int n = 0; n < arr.length; n++) {
            if(arr[n] %2 !=0){
                z+= arr[n];
            }      
        }
         System.out.println("even sum > "+y);
            System.out.println("old sum > "+z);
    }
    
}
