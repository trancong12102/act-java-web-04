/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

/**
 *
 * @author vieth
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle() {
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double chuvi() {
        return this.a+this.b+this.c;
    }
    public double dientich() {
        double q=(this.a+this.b+this.c)/2;
        return Math.sqrt((q-a)*(q-b)*(q-c)*q);
    }
    public void kt() {
        if (a==b&&b==c) {
            System.out.println("La tam giac deu");
            return;
        }
        if (a==b||b==c||c==a) {
            if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
                System.out.println("La tam giac vuong can");
            }
            else 
            {
                System.out.println("La tam giac can");
            }
            return;
        }
        if (a*a+b*b==c*c||a*a+c*c==b*b||b*b+c*c==a*a) {
            System.out.println("Tam giac vuong");
            return;
        }
        System.out.println("Tam giac thuong");
    }
}
