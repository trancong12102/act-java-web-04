/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.demo.java04;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Newdemo_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                System.out.printf("%d khong la so nguyen to\n", n);
                break;
            }
        }
        if (n == 1) {
            System.out.printf("%d la so nguyen to\n", n);
        } else if(isPrime){
            System.out.printf("%d la so nguyen to",n);
            
        }

        }
    }
