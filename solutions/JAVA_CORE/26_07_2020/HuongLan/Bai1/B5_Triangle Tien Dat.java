/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Triangle {
    private float a;
    private float b;
    private float c;
    
    Scanner input = new Scanner(System.in);

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Triangle(){
    }
    
    public float getA(){
        return a;
    }
    
    public void setA(float a){
        this.a = a;
    }
    
    public float getB(){
        return b;
    }
    
    public void setB(float b){
        this.b = b;
    }
    
    public float getC(){
        return c;
    }
    
    public void setC(float c){
        this.c = c;
    }
    
    public void input(){
        System.out.println("--- Nhap do dai ba canh cua tam giac ---");
        System.out.print("Nhap a: ");
        this.a = input.nextFloat();
        System.out.print("Nhap b: ");
        this.b = input.nextFloat();
        System.out.print("Nhap c: ");
        this.c = input.nextFloat();
    }
    
    public void typeOfTriangle(){
        System.out.println("> Tam giac vua nhap la tam giac: ");
        if ((this.a == this.b) && (this.a == this.c)){
            System.out.println("  Tam giac deu.");
        } else if((this.a == this.b) || (this.a == this.c) || (this.b == this.c)){
            System.out.println("  Tam giac can.");
        } else if((Math.pow(this.a,2) + Math.pow(this.b,2) == Math.pow(this.c,2)) || ((Math.pow(this.a,2) + Math.pow(this.c,2) == Math.pow(this.b,2)) || ((Math.pow(this.c,2) + Math.pow(this.b,2) == Math.pow(this.a,2))))) {
            System.out.println("  Tam giac vuong.");
        } else {
            System.out.println("  Tam giac thuong.");
        }
    }
    
    public void perimeter(){
        float P = a + b + c;
        System.out.printf("> Chu vi tam giac = %1.2f\n", P);
    }
    
    public void acreage(){
        float p = (a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.printf("> Dien tich tam giac = %1.2f\n", S);
    }
}
