/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg1;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a = input.nextDouble();
        System.out.println("Nhap b= ");
        b = input.nextDouble();
        temp = a*b;
        while (a!=b)
        {
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        
        System.out.println("UCLN= " +b);
        System.out.println("BCNN= " +temp/b);
    }
}