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
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n");
        int n = Integer.parseInt(sc.nextLine());
        int ft = 1;
        for (int i = 1; i <= n; i++){
            ft = ft * i;
        }
        System.out.printf("%d! = %d \n", n, ft);
       
         
    }
    
}
