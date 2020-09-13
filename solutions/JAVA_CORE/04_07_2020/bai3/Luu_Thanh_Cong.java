/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession2;

import java.util.Scanner;

/**
 *
 * @author luuthanhcong
 */
public class B3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("nhap n");
        int n = s.nextInt();
        
        // n % (2 .... can n ) == 0 -- n k là so ng to
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                System.out.println("kh p snt");
                break;
            }
        }
        if(isPrime){
            System.out.println("la so nt"); 
       }
    }
}
