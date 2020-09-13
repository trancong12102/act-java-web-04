/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap a: ");
        int a = input.nextInt();       
        
        System.out.print("Nhap b: ");
        int b = input.nextInt();
        
        System.out.print("Nhap c: ");
        int c = input.nextInt();

        System.out.println("---- Giai phuong tỉnh bac 2 ---- ");

        if (a == 0) {
            System.out.println(" Gia tri a nhap vao khong hop le ! ");
        } else {
            int delta = b*b - 4*a*c;
            if (delta >0){
                System.out.println(" Phuong trinh co 2 nghiem phan biet ! ");
                double x1 = (- b + Math.sqrt(delta))/(2*a);
                double x2 = (- b - Math.sqrt(delta))/(2*a);
                System.out.println(" Nghiem cua phuong trinh la ");
                System.out.printf(" x1 = %f " + x1);
                System.out.printf(" x2 = %f " + x2);
            } else if (delta == 0) {
                System.out.println(" Phuong trinh co nghiem kep ! ");
                double x = -b/(2*a);
                System.out.println(" Nghiem cua phuong trinh la ");
                System.out.printf(" x = %f " + x);
            } else {
                System.out.println(" Phuong trinh vo nghiem ! ");
            }
        }
    }
}
