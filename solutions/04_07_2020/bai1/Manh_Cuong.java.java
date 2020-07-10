/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg1;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("xin chao mung den voi chuong trinh tinh phuong trinh bac 2 co dang: ax^2+bx+c=0");
        Scanner sc= new Scanner(System.in);
        System.out.println("Hay nhap a:");
        float a= sc.nextFloat();
        System.out.println("Hay nhap b:");
        float b= sc.nextFloat();
        System.out.println("Hay nhap c");
        float c= sc.nextFloat();
        if(a==0)
        {
            if(b==0)
            {
                if(c==0)
                {
                    System.out.println("Phuong trinh vo so nghiem");
                }
            }
            else
            {
                System.out.println("Phuong trinh co nghiem duy nhat x= "+(-c/b));
            } 
        }
        else
        {
            float delta=b*b-4*a*c;
            if(delta<0)
            {
                System.out.println("Phuong trinh khong co nghiem thuc");   
            }
            else if(delta==0)
            {
                System.out.println("Phuong trinh co nghiem kep x1=x2= "+(-b/(2*a)));
            }
            else
            {
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1= "+(((-b+Math.sqrt(delta))/(2*a))));
                System.out.println("x2= "+(((-b-Math.sqrt(delta))/(2*a))));
            }
        }
        
    }
    
}
