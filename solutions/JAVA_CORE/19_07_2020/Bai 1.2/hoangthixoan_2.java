/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Gia tri cac phan tu trong mang:");
            a[i] = sc.nextInt();
        }
        //phan tu lon nhat, nho nhat
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < n; i++) {
           if (max < a[i]) {
                max = a[i];
            }
           if (min > a[i]){
               min = a[i];
           }
           
        }
            //in phan tu lon nhat, nho nhat
            System.out.println("Phan tu lon nhat trong mang " + max);
            System.out .println("Phan tu nho nhat trong mang "+min);
        //cac so chia het cho 3
        for (int i = 0; i < n; i++) {
            if(a[i]%3==0){
                System.out.println("so chia het cho 3 la"+a[i]);
            }            
        }

    }

   
}
