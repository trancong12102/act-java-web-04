/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt = gt * i;
        }
        System.out.println(n + "! = " + gt);
    }

}
