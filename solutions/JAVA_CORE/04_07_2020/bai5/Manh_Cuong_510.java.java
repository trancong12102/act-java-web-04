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
public class bai510 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap x= ");
        int S = 0;
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x *= x;
        System.out.println("Nhap n= ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            S += Math.pow(x, i);
        }
        System.out.println("Tong la: " + S);
    }

}
