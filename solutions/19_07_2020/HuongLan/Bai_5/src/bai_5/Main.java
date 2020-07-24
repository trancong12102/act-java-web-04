/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_5;

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
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        System.out.println("Nhap vector A(xa, ya, za) =");
        for (int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vertor B(xb, yb, zb) =");
        for (int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        int c[] = new int[3];
        for (int i = 0; i < 3; i++) {
            c[i] = a[i] + b[i];
        }
        System.out.print("Tong 2 vecto la: ( ");
        int tich=0;
        for (int i = 0; i < 3; i++) {
            tich+=a[i]*b[i];
            if (i == 2) {
                System.out.print(c[i] + ")");
            } else {
                System.out.print(c[i] + ",");
            }
        }
        System.out.println("\nTich vo huong cua 2 vector la: "+ tich);
    }

}
