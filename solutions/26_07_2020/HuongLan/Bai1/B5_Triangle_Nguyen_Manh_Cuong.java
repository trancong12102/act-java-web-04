/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Triangle {

    private float a;
    private float b;
    private float c;

    void inputInfo() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a,b,c which can make a triangle");
            System.out.print("Enter a= ");
            this.a = sc.nextFloat();
            System.out.print("Enter b= ");
            this.b = sc.nextFloat();
            System.out.print("Enter c= ");
            this.c = sc.nextFloat();
        } while (this.a + this.c <= this.b || this.a + this.b <= this.c || this.b + this.c <= this.a);
    }

    void Check() {
        if (this.a == this.c || this.a == this.b || this.b == this.c) {
            if (this.a == this.b && this.b == this.c) {
                System.out.println("This is a equilateral triangle");//đều
            }else if(this.a*this.a+this.b*this.b==this.c*this.c||this.a*this.a+this.c*this.c==this.b*this.b||this.b*this.b+this.c*this.c==this.a*this.a){
                System.out.println("This is a square triangle");//vuông cân
            }else{
                System.out.println("this í aisosceles triangle");//cân
            }
        }else if(this.a*this.a+this.b*this.b==this.c*this.c||this.a*this.a+this.c*this.c==this.b*this.b||this.b*this.b+this.c*this.c==this.a*this.a){
            System.out.println("This is a right triangle");
        }else{
            System.out.println("This is a normal triangle");
        }
    }
    void equal(){
        System.out.println("perimeter of this triangle is: "+(this.a+this.b+this.c));
    }
    void finishh(){
        float half=(this.a+this.b+this.c)/2;
        System.out.println("Area of this triangle is: "+Math.sqrt(half*(half-this.a)*(half-this.b)*(half-this.c)));
    }
}
