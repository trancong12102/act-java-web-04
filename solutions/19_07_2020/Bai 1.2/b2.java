/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_1_chieu;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class b2 {
    public static void main(String[] args) {
         int [] arr = new int [5];
         int [] brr = new int [5];
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();           
        }
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
            
        }
        System.out.println("max > "+max);
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            
        }
        System.out.println("min > "+min);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] %3 == 0){
                 System.out.printf("%d chia het cho 3\n",arr[i]);
            }
            
        }
        
    }
            
}
