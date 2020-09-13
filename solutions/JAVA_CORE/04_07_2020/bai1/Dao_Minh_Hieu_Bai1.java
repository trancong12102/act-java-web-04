/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demo.java;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a ");
        int a = input.nextInt();
        System.out.println("Nhap b ");
        int b = input.nextInt();
        System.out.println("Nhap c ");
        int c = input.nextInt();
        if (a != 0) {
            int delta = (b*b)-4*a*c;
            if (delta < 0){
                System.out.println("Phuong trinh vo nghiem");    
            }
            else if (delta == 0) {
                int x = -b/(2*a);
                System.out.println("Phuong trinh co nghiem kep x1=x2="+x);
        }
            else {
                double x1 = (-b+(Math.sqrt(delta)))/(2*a);
                double x2 = (-b-(Math.sqrt(delta)))/(2*a);
                System.out.println("phuong trinh co hai nghiem");
                System.out.println("x1="+x1);
                System.out.println("x2="+x2);
            }
        }
        }
    }
        
   
    
    

