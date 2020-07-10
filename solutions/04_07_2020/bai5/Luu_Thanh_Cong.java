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
public class B5a {
    public static void main(String[] args){
        // s = 1 + 1/2 + 1/3 +...+ 1/n
        Scanner s = new Scanner(System.in);
        int n;
        float sum = 0;
        System.out.println("Nhập n : ");
        n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            sum+= 1/i; 
        }
        System.out.println(sum);
    }
        
    
}
