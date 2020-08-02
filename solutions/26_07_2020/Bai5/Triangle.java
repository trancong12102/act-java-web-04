package bai5;

import java.util.Scanner;

/**
 *
 * @author Trieu
 */
public class Triangle {

    float a;
    float b;
    float c;

//Contructor khong co tham so
    public Triangle() {

    }

    //Contructor co tham so
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }
//Ham set get

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    //Cac phuong thuc
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do dai canh a =");
        a = sc.nextFloat();
        System.out.println("Nhap do dai canh b =");
        b = sc.nextFloat();
        System.out.println("Nhap do dai canh  c=");
        c = sc.nextFloat();
    }

    void kiemTra() {
        if (a == b && b == c) {
            System.out.println("Tam giác đều");
            return;
        }
        if (a == b || b == c || c == a) {
            if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("Tam giác vuông cân");
            } else {
                System.out.println("Tam giác cân");
            }
            return;
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            System.out.println("Tam giac vuông");
            return;
        }
        System.out.println("Tam giác thường");
    }
    
    void tinhChuViDienTich(){
        float P=(this.a+this.b+this.c)/2;
        System.out.println("Chu vi tam giac"+(this.a+this.b+this.c));
        System.out.println("DIen tich tam giac"+Math.sqrt(P*(P-a)*(P-b)*(P-c)));
    }
}
