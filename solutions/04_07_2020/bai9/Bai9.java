/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai9 {

    /**
     * cosx: -2pi<x<2pi
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("nhap so x(rad): ");
        double x = sc.nextDouble();
        System.out.println("nhap so n: ");
        int n = sc.nextInt();
        double S=0;
        double a;
        for(int i=0;i<n;i++)
        {
            int c=2*i;
            a=1;
           for(int j=1;j<=c;j++)
           {
               a*=j;
           }
            S+=pow(-1,i)*pow(x,c)/a;
            System.out.println("c = "+c);
            System.out.println("a = "+a);
        }
        System.out.println("cos("+x+")= "+S);
    }
    
}
