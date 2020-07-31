/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapclass5;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Triangle {
      private int a;
    private int b;
    private int c;

    public Triangle() {

    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void nhap() {
        System.out.println("nhap a:");
        setA(new Scanner(System.in).nextInt());
        System.out.println("nhap b:");
        setB(new Scanner(System.in).nextInt());
        System.out.println("nhap c:");
        setC(new Scanner(System.in).nextInt());
    }

    public void kieuTriangle() {
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("day ko phai tam giac");
        } else {
            if (a == b && a == c && b == c) {
                System.out.println("tam giac deu");
            }
            if (a == b && a == c || a == c && b == c && a == b && b == c) {
                System.out.println("tam giac can");
            }
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("tam giac vuong");
            } else {
                System.out.println("tam giac nhon");
            }
        }
    }

    public void chuviTriangle() {
        int cv = getA() + getB() + getC();
        System.out.println("chu vi tam giac la` :" + cv);

    }

    public void dientichTriangle() {
        int p = (getA() + getB() + getC()) / 2;
        double dientich = (double) Math.sqrt(p * (p - getA()) * (p - getB()) * (p - getC()));
        System.out.println("dien tich tam giac:" + dientich);

    }
}
    

