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
public class bai533 {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so n=");
        int S = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            S += i * i;
        }
        System.out.println("Tong la: " + S);
    }

}
