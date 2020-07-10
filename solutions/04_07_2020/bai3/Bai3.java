/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

import java.io.PrintStream;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = input.nextInt();
        int a=0;
        if (n==1)
            System.out.println("so "+n +"khong la so nguyen to");
                
        else
                {
                  for(int i=2;i<n;i++)
                  {
                      if(n%i==0)
                          a++;
                  }
                  if(a==0)
                        System.out.println("so "+n+" la so nguyen to");
                  else
                      System.out.println("so "+n+" khong la so nguyen to");
                      
                  
                }
        
    }
    
}
