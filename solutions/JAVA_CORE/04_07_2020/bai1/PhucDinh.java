/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gptb2;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class GPTb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, b,c,delta, x1, x2; 
        Scanner PT = new Scanner(System.in);
        System.out.println("Nhap a= ");
        a= PT.nextDouble();
        System.out.println("Nhap b= ");
        b= PT.nextDouble();
        System.out.println("Nhap c= ");
        c= PT.nextDouble();
        if (a==0){
            if(b==0)
                if(c==0)
                   System.out.println("Phương trình vô số nghiệm");
                else
                   System.out.println("Phương trình vô nghiệm");
        else
            System.out.println("Phương trình có nghiệm duy nhất:" + (-c)/b);
        }
        else{
        delta = b*b -4*a*c;
        if (delta >0){
            x1= ((-b) + Math.sqrt(delta))/(2*a);
            x2= ((-b) - Math.sqrt(delta))/(2*a);
            System.out.println("Nghiệm 1 là:" + x1);
            System.out.println("Nghiệm 2 là:" + x2);
        }
        else {
                if(delta ==0)
                    System.out.println("Phương trình có nghiệm kép x1 = x2 =" + (-b)/(2*a));
                else 
                   if(delta <0)
                        System.out.println("PTVN");
             }
        
       }
           
    }

    
}
