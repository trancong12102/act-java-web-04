/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap6;

import java.util.Scanner;


public class Baitap6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int a,b,i,j;
       
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap vao hai so a va b:");
        a= nhap.nextInt();
        b= nhap.nextInt();
       for ( i=a; i>2; i--)
        {if (a%i==0 & b%i==0)     
        break;
    }
        System.out.print("Uoc chung lon nhat la:"+i);
        for (j=2;j<a; j++)
        {if (a%i==0 & b%i==0)
            break;
            }
        if(a<b)
        System.out.print("boi chung nho nhat la:"+(j*b));
        else System.out.print("boi chung nho nhat:"+(j*a));
    } 
        
      
    }
    





























