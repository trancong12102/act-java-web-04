/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg41;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Tamgiac {

    private int a;
    private int b;
    private int c;

    public Tamgiac() {

    }

    public Tamgiac(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh a = ");
        a = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap do dai canh b = ");
        b = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap do dai canh c = ");
        c = Integer.parseInt(sc.nextLine());
    }

    public void isTamgiac() {
        if (a == b && a == c) {
            System.out.println("Tam giac deu");
        }
        if (a == b && a != c) {
            System.out.println("Tam giac can");

        }  if ((a * a == b * b + c * c)||(c * c == b * b + a * a)||(b * b == c * c + a * a)) {
            System.out.println("Tam giac vuong ");
        }

    }

    public void Chuvi() {
        int P;
        P = a + b + c;
        System.out.printf("Chu vi cua tam giac la :%d", P);

    }

    public void Dientich() {

        int p;
        p = (a + b + c) / 2;
        double S =  Math.sqrt(p*(p - a) * (p - b) * (p - c));
        System.out.printf("Dien tich cua tam giac la : %f", S);
        

    }

}
