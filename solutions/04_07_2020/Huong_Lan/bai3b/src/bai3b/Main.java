/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3b;

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
        int dem = 0;
        System.out.println(n + " so nguyen to dau la: ");
        for (int j = 2;; j++) {
            int flag = 0;
            for (int i = 2; i < j / 2; i++) {
                if (j % i == 0) {
                    flag++;
                }
            }
            if (flag == 0) {
                System.out.println(j + " ");
                dem++;
            }
            if (dem == n) {
                break;
            }
        }

    }

}
