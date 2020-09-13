/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bài1_5 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.printf("xA:");
    int xA = sc.nextInt();
     System.out.printf("yA:");
    int yA = sc.nextInt();
     System.out.printf("zA:");
    int zA = sc.nextInt();
     System.out.printf("xB:");
    int xB = sc.nextInt();
     System.out.printf("yB:");
    int yB = sc.nextInt();
     System.out.printf("zB:");
    int zB = sc.nextInt();
     
     System.out.printf("Tong cua hai vector la: (%d ,%d ,%d)\n",xA+xB,yA+yB,zA+zB);
     System.out.printf("Tich vo huong cua hai vector la: (%d,%d,%d)\n",xA*xB,yA*yB,zA*zB);
    }
    
}
