/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_2;

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
        System.out.println("Nhap a:");
        int a = input.nextInt();
        System.out.println("Nhap b:");
        int b = input.nextInt();
        int tich = a * b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
//return a;
        System.out.println("bai chung nho nhat la: " + tich / a);
    }

}
