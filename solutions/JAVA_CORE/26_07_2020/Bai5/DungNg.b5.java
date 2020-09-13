/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT5;

import java.util.Scanner;

/**
 *
 * @author Dung Ng
 */
public class Triangle {
    private int a,b,c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
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
    
     void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao do dai ba canh: ");
        this.a=input.nextInt();
        this.b=input.nextInt();
        this.c=input.nextInt();
    }
    
    void typeOfTriangle(){
        if(a==b && a==c && c==b){
            System.out.println("Tam giac deu");
        }
        if(a==b && a==c || b==a && b==c || c==a && c==b){
            System.out.println("Tam giac can");
        }
        if(a*a == b*b + c*c || b*b == a*a + c*c || c*c == a*a + b*b){
            System.out.println("Tam giac vuong");
        }
    }
    
    void math(){
        System.out.println("Chu vi cua tam giac la > " + (a+b+c)); 
        double p=(a+b+c)/2;
        System.out.println("Dien tich tam giac la > " +(double)Math.sqrt(p*(p-a)*(p-b)*(p-c)));
    }
}
