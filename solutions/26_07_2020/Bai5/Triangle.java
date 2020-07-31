
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class Triangle {

    private double a, b, c;
    int d;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int d) {
        this.d = d;
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

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void INPUTCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("->nhap 3 canh cua tam giac<-");
        System.out.print("a=>>");
        a = sc.nextDouble();
        System.out.print("b=>>");
        b = sc.nextDouble();
        System.out.print("c=>>");
        c = sc.nextDouble();

    }

    public void CHUVI() {
        if (d != 0) {
            System.out.println("chu vi tam giac la " + (this.a + this.b + this.c));
        }

    }

    public void DIENTICH() {
        double S, P;
        if (d != 0) {
            P = (a + b + c);
            S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
            System.out.println("Dien tich tam giac la " + S);
        }

    }

    public void xacdinhtamgiac() {
        if (a + b > c && b + c > a && a + c > b)
        {
            d = 1;
            if (a == b && b == c && a == c) {
                System.out.println("---> Tam giac deu <---");
                d++;
            } else if (a == b || b == c || c == a) {
                System.out.println("---> Tam giac can <---");
                d++;
            }
            if (a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b)) {
                System.out.println("---> Tam giac vuong <---");
                d++;
            }
        } else {
            d = 0;
            System.out.println("---> Khong la tam giac <---");
        }
        if (d == 1) {
            System.out.println("> TAm giac thuong <");
        }

    }

}
