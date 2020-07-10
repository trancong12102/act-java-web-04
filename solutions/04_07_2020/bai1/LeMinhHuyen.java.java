/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptinhtoan;

import java.util.Scanner;

public class phuongtrinhbac2 {

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println(" Nhap a: ");
        a = Integer.parseInt(input.nextLine().trim());
        System.out.println("Nhap b: ");
        b = Integer.parseInt(input.nextLine().trim());
        System.out.println("Nhap c: ");
        c = Integer.parseInt(input.nextLine().trim());

        if (a == 0) {
            if (b == 0) {
                System.out.print("Phuong trinh vo nghiem");
            } else if (c == 0) {
                System.out.print("Vo so nghiem ");
            } else {
                System.out.println("Phuong trinh co nghiem la" + -b / a);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                
                double X = (double) (-b / (2 * a));
                System.out.println("phuong trinh co nghiem kep la" + X);
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet");
                System.out.println((-b + Math.sqrt(delta)) / (2 * a));
                System.out.println((-b - Math.sqrt(delta)) / (2 * a));
            }

        }

    }

}
