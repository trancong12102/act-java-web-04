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
public class Triangle extends Rectangle{
    private double c;

    public Triangle() {
    }

    public Triangle(double c, double a, double b) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    @Override
    public void InputInfo(){
        Scanner sc = new Scanner(System.in);
        super.InputInfo();
        System.out.println("Nhap canh c: ");
        c = Integer.parseInt(sc.nextLine());
        
    }
    
    @Override
    public double Acreage(){
        double S = 0.25*Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b));
        return S;
    }
    
    @Override
    public double Perimeter(){
        double P = 2*((0.5)*(a+b+c));
        return P;
    }
    
}
