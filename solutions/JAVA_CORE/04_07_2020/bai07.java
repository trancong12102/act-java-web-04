/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5_7;

import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class bai07 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int max = Integer.parseInt(input.nextLine());
        System.out.println("Dãy số fibonacci: ");
        for (int i = 1;; i++) {
            //System.out.print(fibonacci(i, max) + " ");
            if ( fibonacci(i, max) >= max ){
                   break; 
            }
            else
                System.out.print(fibonacci(i, max) + " ");
        }
    }
     
    public static int fibonacci(int n, int max) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
                if ( fn >= max ){
                   break; 
                }
            }
        }
        return fn;
    }
}
