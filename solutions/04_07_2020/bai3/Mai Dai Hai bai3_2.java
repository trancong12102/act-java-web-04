/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10_6;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("nhập số n số nguyên tố cần tìm:");
        float n = input.nextInt();
        float dem = 0;
        float i=1;
        float j;
        float k=0;
        System.out.printf(n+" số nguyên tố đầu tiên là: ");
        do {
            i++;
            for (j=1;j<=i;j++){ 
                if (i%j==0){
                        dem++;
                }       
            }
            if (dem==2){
                System.out.printf(i+ ", ");
                k++;
            }
            dem=0;
        }
        while(k<n);
    
    }
    }

