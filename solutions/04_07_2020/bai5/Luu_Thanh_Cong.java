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
public class B5h {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập n : ");
        int n = s.nextInt();
        int tich = 1;
        int tong = 0;
        for (int i = 1; i <= n; i++) {
            tich *= i;
            tong += tich;
        }
        System.out.println(tong);
    }
}
