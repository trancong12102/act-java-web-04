/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] n = new int[10000000];
     int i=0;
     for(i=0;i<10000000;i++){
            System.out.println("Nhận n=");
            n[i]=sc.nextInt();
            if (n[i]== 0){
               break;
            }
    }
     int max = n[0];
     for(int x=1;x<=i;x++){
         if(n[x]>max){
             max=n[x];
         }
     }
        System.out.println("Số lớn nhất là: "+max);
     int min =n[0];
     for(int x=1;x<=i;x++){
         if(n[x]<min){
             min=n[x];
         }
     }
        System.out.println("Số nhỏ nhất là: "+min );
    }
}   
    
