/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5tamgiac;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap canh c: ");
        c = Integer.parseInt(sc.nextLine());
    }
    
    public String KieuTG(){
        if(a == b && a == c && b == c){
            return "Tam giac deu";
        }
        else if(a == b || a == c || b == c) {
            return "Tam giac can";
        }
        return "Tam giac thuong";
    }
    
    public double ChuVi(){
        System.out.println("Chu vi tam giac: ");
        double P = 2*((0.5)*(a+b+c));
        return P;
    }
    
    public double STG(){
        System.out.println("Dien tich tam giac: ");
        double S = 0.25*Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
        return S;
    }
}
