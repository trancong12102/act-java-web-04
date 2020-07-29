/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap12;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int arr[] =  new int [n];
        int Sum = 0,Sumle = 0,Sumchan = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap gia tri phan tu");
            arr[i]= new Scanner(System.in).nextInt();
                
            }
        System.out.println("gia tri vua nhap");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); 
    
}
        for (int i = 0; i < arr.length; i++) {
            Sum+= arr[i];
        }
        System.out.println("tong la "+Sum);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                Sumle+=arr[i];
            }}
          System.out.println("tong le"+Sumle);
          for (int i = 0; i < arr.length; i++) {
              if(arr[i]% 2==0){
                  Sumchan+=arr[i];
              }
            
        }
                   System.out.println("tong la "+Sumchan);
            
            
        }
}