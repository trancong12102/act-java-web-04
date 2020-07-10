/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

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
        System.out.println("Nhap a:");
        int a = input.nextInt();
        System.out.println("Nhap b:");
        int b = input.nextInt();
        System.out.println("Nhap c:");
        int c = input.nextInt();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem x = " + (float) (-c / b));
            }
        } else {
            int delta = b * b - 4 * a * c;
            if (delta > 0) {
                float x1 = (float) (-b + Math.sqrt(delta)) / (2 * a * c);
                float x2 = (float) (-b - Math.sqrt(delta)) / (2 * a * c);
                System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + "va x2 = " + x2);
            } else if (delta == 0) {
                float x = (float) (-b) / (2 * a * c);
                System.out.println("Phuong trinh co nghiem kep x= " + x);
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }

        }

    }

}
