/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        
        if (n < 0){
            System.out.println("Gia tri n nhap vao khong hop le !");
        } else {
            int [] sum = new int [n];
            sum[0] = sum [1] = 1;
    
            System.out.println("--- Day so Fibonaci ---");
            
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == 1) {
                    System.out.printf("%d ",sum[i]);
                } else {
                    sum [i] = sum [i-1] + sum[i-2];
                    System.out.printf("%d ",sum[i]);
                }
            }       
            System.out.print("\n");   
        }
    }
}
