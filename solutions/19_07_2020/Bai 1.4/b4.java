/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mang_1_chieu;

import java.util.Random;

/**
 *
 * @author Dung Ng
 */
public class b4 {
    public static void main(String[] args) {
        //khoi tao lop random
        Random rd = new Random();
         int [] arr = new int [15];
         //nhap 15 so random vao mang
         for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();           
        }
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
            
        }
         //giam dan
        int tam;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    //hoan vi hai so a[i] va a[j]
                    tam = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tam;
                }
                
            }
            
        }
        System.out.println("mang sau sap xep giam dan la: ");
         for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
            
        }
         //tang dan
           int tamp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    //hoan vi hai so a[i] va a[j]
                    tamp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tamp;
                }
                
            }
            
        }
        System.out.println("mang sau sap xep tang dan la: ");
        
        //chan - le
        int y = 0, z = 0;     
          for (int m = 0; m < arr.length; m++) {
            if(arr[m] %2==0){
                y++;
            } 
        }
          System.out.println("so chan trong mang: "+y);
        for (int n = 0; n < arr.length; n++) {
            if(arr[n] %2 !=0){
                z++;
            }      
        }
         System.out.println("so le trong mang: "+z);
    }
}
