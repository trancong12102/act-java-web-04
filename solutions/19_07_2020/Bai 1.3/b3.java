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
public class b3 {
    public static void main(String[] args) {
        int [] arr = new int [5];
//        int [] arr = {2,4,5,2,5};
         Scanner sc = new Scanner(System.in);
         System.out.println("moi nhap 5 pt cua mang");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();           
        }
        System.out.println("nhap so can kt");
        int x = sc.nextInt();
        boolean bo = false;
        for (int i = 0; i < arr.length; i++) {
           if (x - arr[i] == 0){
              bo = true;
           }  
          
        }
        if(bo == true){
            System.out.printf("so %d co trong mang",x);
        }
        else{
            System.out.printf("so %d ko co trong mang",x);
        }
        
    }
}
