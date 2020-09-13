/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;
import jdk.jfr.Unsigned;

/**
 *
 * @author Admin
 */
public class bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap N giai thua");
        int n = sc.nextInt();
        int res = 1;
        for (int i = 1; i <= n  ; i++) {
            res = res*i;
        }
        System.out.println("Gia gia tri N! = "+res);
    }
    
}
