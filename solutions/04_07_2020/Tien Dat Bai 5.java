/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        
        double S1 = 0;
        for (int i = 1; i <= n; i++) { 
            S1 += (1.0)/i;
        }
        System.out.printf("Gia tri S1 = 1 + 1/2 + ... + 1/n = %f \n", S1);
        
        int S2 = 0;
        for (int i = 1; i <= n; i++) { 
            S2 += i;
        }
        System.out.printf("Gia tri S2 = 1 + 2 + ... + n = %d \n", S2);
        
        int S3 = 0;
        for (int i = 1; i <= n; i++) { 
            S3 += Math.pow(i,2);
        }
        System.out.printf("Gia tri S3 = 1^2 + 2^2 + ... + n^2 = %d \n", S3);
        
        double S4 = 0;
        for (int i = 1; i <= n; i++) { 
            S4 += (1.0)/(2*i);
        }
        System.out.printf("Gia tri S4 = 1/2 + 1/4 + ... + 1/2n = %f \n", S4);
        
        double S5 = 0;
        for (int i = 0; i <= n; i++) { 
            S5 += (1.0)/(2*i + 1);
        }
        System.out.printf("Gia tri S5 = 1 + 1/3 + ... + 1/(2n+1) = %f \n", S5);
        
        double S6 = 0;
        for (int i = 1; i <= n; i++) { 
            S6 += (1.0)/(i * (i + 1));
        }
        System.out.printf("Gia tri S6 = 1/(1*2) + 1/(2*3) + ... + 1/(n*(n+1)) = %1.3f \n", S6);
        
        double S7 = 0;
        for (int i = 0; i <= n; i++) { 
            S7 += (2*i + (1.0))/(2*i + 2);
        }
        System.out.printf("Gia tri S7 = 1/2 + 3/4 + ... + (2*n + 1)/(2*n + 2) = %f \n", S7);
        
        int S8 = 1;
        int ft = 1;
        for (int i = 2; i <= n; i++) {
            ft = ft*i;
            S8 += ft;
        }
        System.out.printf("Gia tri S8 = 1 + 1*2 + ... + 1*2*...*n = %d \n", S8);
        
        System.out.print("Nhap x: ");
        int x = input.nextInt();
        
        double S9 = 0;
        for (int i = 1; i <= n; i++) {
            S9 += Math.pow(x,(i));
        }
        System.out.printf("Gia tri S9 = x + x^2 + ... + x^n = %1.0f \n", S9);
        
        double S10 = 0;
        for (int i = 1; i <= n; i++) {
            S10 += Math.pow(x,(2*i));
        }
        System.out.printf("Gia tri S10 = x^2 + x^4 + ... + x^2n = %1.0f \n", S10);
        
        double S11 = 0;
        for (int i = 0; i <= n; i++) {
            S11 += Math.pow(x,(2*i+1));
        }
        System.out.printf("Gia tri S11 = x + x^3 + ... + x^(2n+1) = %1.0f \n", S11);
        
        double S12 = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            S12 += (1.0)/sum;
        }
        System.out.print(sum);
        System.out.printf("Gia tri S12 = 1 + 1/(1+2) + ... + 1/(1+2+...+n) = %1.3f \n", S12);
    }
}
