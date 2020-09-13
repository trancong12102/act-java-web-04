/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10_6;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai1 {
    public static void main(String[] args) {
        // TODO code application logic here
        float denta;
        float x1;
        float x2;
        Scanner input = new Scanner(System.in);
        System.out.printf("nhap a= ");
        float a = input.nextFloat();
        System.out.printf("nhap b= ");
        float b = input.nextFloat();
        System.out.printf("nhap c= ");
        float c = input.nextFloat();
        if (a == 0) {
            System.out.println(" pt tren khong phai la pt bac 2");

        }
        else
        {
        denta = b * b - 4 * a * c;
        if (denta < 0) {
            System.out.println("pt vo nghiem");
        }
        else if (denta == 0) {
            x1 = -b / (2 * a);
            System.out.println("pt co 1 nghiem kep là x= " + x1);
        } else {
            x1 = (-b + denta) / (4 * a);
            x2 = (b + denta) / (4 * a);
            System.out.printf("pt co 2 nghiem là " );
            System.out.printf("x1= " + x1);
            System.out.printf(" x2= " + x2);

        }
        }
    }
        
    
}
