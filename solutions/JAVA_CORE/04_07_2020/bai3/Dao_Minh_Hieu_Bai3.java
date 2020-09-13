/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("n > ");
        int n = Integer.parseInt(sc.nextLine());
        
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0){
                    System.out.printf("%d khong phai la so nguyen to/n",n);
                    isPrime = false;
                    break;
                    
                }
            }
        if (n==1) {
            System.out.printf("%d khong phai la so nguyen to \n",n );
        }
        if (isPrime) {
            System.out.printf("%d la so nguyen to /n",n);
        }
        }
       
    }
    

