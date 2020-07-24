/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_1 {
    public static void main(String[] args) {
     int[] phantu= new int[5];
     int sum=0;
     int tongchan=0;
     int tongle=0;
     Scanner input = new Scanner(System.in);
     for(int i=0;i<phantu.length;i++){
         System.out.println("Nhập phần tử: ");
         phantu[i] = input.nextInt();
         sum+=phantu[i];
         if(phantu[i]%2==0){
             tongchan+=phantu[i];
         }else{
             tongle+=phantu[i];
         }
      
     }
     System.out.println("Tổng các phần tử là:"+sum);
     System.out.println("Tổng chẵn là:"+tongchan);
     System.out.println("Tổng lẻ là:" +tongle);
   
    }
}
