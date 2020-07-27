/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *

 */
public class Bai1 {


    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c,x1,x2;
        float d=0;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap cac he so a:\n b:\n c:\n");
        a= nhap.nextFloat();
        b= nhap.nextFloat();
        c= nhap.nextFloat();
        if (a==0){
                {System.out.print("Phuong trinh co nghiem duy nhat: x= "+(float)(-c/(2*b)));}
         if (b==0) 
         {System.out.print("Phuong trinh vo nghiem");}
                }
        else  
            d=(float) b*b-4*a*c;
        if (d<0 ){
            System.out.print("Phuong trinh vo nghiem");
        }
        else if (d==0) {
            System.out.print("Phuong trinh co nghiem kep: X1=X2= "+(float)(-b/(2*a)));
        }
        else 
        { x1=(float)(-b-Math.sqrt(d))/(2*a);
            x2=(float)(-b+Math.sqrt(d))/(2*a);
        System.out.print("Phuong trinh co hai nghiem phan biet X1= "+x1+"X2= "+x2);}
    
    
}
}
































