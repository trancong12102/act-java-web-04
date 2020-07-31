/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class bai5 {
    public static void main(String[] args) {
        
    Triangle triangle=new Triangle();
    Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh:");
        triangle.setA(sc.nextDouble());
        triangle.setB(sc.nextDouble());
        triangle.setC(sc.nextDouble());
        System.out.println("Chu vi:"+triangle.chuvi());
        System.out.println("Dien tich:"+triangle.dientich());
        triangle.kt();
    }
}
