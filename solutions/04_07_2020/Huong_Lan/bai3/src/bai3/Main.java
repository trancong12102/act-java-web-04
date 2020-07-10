/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        int flag = 0;
        if (n < 2) {
            flag++;
        } else {

            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    flag++;
                }
            }

        }
        if (flag == 0) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai so nguyen to");
        }
    }

}
