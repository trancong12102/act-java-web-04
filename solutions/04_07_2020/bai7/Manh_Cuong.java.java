/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                System.out.printf("1\t");
            } else {
                int c = a + b;
                System.out.printf("%d\t", c);
                a = b;
                b = c;
            }

        }
    }

}
