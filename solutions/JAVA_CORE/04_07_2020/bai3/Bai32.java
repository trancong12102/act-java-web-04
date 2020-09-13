/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3.pkg2;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n= input.nextInt();
        int b = 0;
        int c=0;
        boolean abc = true;
        int a ;
        while(b<n){
            System.out.println("nhap so a: ");
            a= input.nextInt();
            for(int i=2;i<a;i++)
        {
            if(a%i==0)
                c++;
        }
            if((c>0)||(a<2)) {
            } else
            {
                System.out.println("so"+a+" la so nguyen to");
                c=0;
                b++;
            }
            
        }
        
        
    } 
}

    

