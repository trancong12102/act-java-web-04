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
public class B5f {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhập n : ");
        int n = s.nextInt();
        float sum = 0;
        for (int i = 1; i < n; i++) {
            sum += 1/(i*(i+1));
        }
        System.out.println(sum);
    }
}
