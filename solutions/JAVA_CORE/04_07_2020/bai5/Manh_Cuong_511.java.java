/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class bai511 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap x= ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Nhap n= ");
        int n = sc.nextInt();
        int S = x;
        for (int i = 1; i <= n; i++) {
            S += Math.pow(x,(2*i)+1);
        }
        System.out.println("Tong la: " + S);
    }
    
}
