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
public class B2 {
    public static void main(String[] args){
        // Viết chương trình tính giai thừa của 1 số nguyên dương 
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập số : ");
        int n = Integer.parseInt(s.nextLine());
        int ft = 1;
        for (int i = 1; i <= n; i++) {
            ft = ft * i;
        }
        System.out.println(ft);
    }
    
}
