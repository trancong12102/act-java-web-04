/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n de in ra day fibonaci:");
        int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
