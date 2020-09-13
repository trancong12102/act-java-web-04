/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Rectangle {
    protected double a;
    protected double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
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
    
    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao chieu rong b: ");
        b = Integer.parseInt(sc.nextLine());
    }
    
    public double Acreage() {
        double S = this.a *this.b;
        return S;
    }
    
    public double Perimeter() {
        double P = 2*(this.a + this.b);
        return P;
    }
    
}
