/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Triangle {
     private float a, b, c;

    public Triangle() {
    }

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

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
    
    
    public void inputInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---Ba cạnh của tam giác---");
        System.out.print(" a= ");
        this.a = sc.nextFloat();
        System.out.print(" b= ");
        this.b = sc.nextFloat();
        System.out.print(" c= ");
        this.c = sc.nextFloat();
    }
    public void Kieutamgiac(){
        if(a==b&&b==c){
            System.out.println("Tam giác đều");
            return;
        }
        if(a==b||b==c||c==a){
            if(a*a+b*b==c*c||a*a+c*c==b*b|| b*b+c*c==a*a){
                System.out.println("Tam giác vuông cân");
            }else{
                System.out.println("Tam giác cân");
            }
            return;
        }
        if(a*a+b*b==c*c||a*a+c*c==b*b|| b*b+c*c==a*a){
            System.out.println("Tam giac vuông");
            return;
        }
        System.out.println("Tam giác thường");
         
    }
    public void printInfo(){
        float chuvi=(this.a+this.b+this.c);
        System.out.println("Chu vi tam giác là: "+chuvi);
        float dientich=(float) (Math.sqrt(chuvi)*(chuvi*a+chuvi*b+chuvi*c));
        System.out.println("Dien tích tam giác là: "+dientich);
    }
}
