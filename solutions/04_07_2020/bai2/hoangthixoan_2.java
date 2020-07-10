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
public class newdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n >>");
        int n = sc.nextInt();
        int ft = 1;
        for (int i =1; i <=n;i++){
            ft= ft*i;
        }
        System.out.printf("%d =%d\n",n,ft);
    }
}
