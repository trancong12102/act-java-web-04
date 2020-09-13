/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6.pkg2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
       if(a>b)
       {
           for(int i=1;i<=b;i++)
           {
               if(a%i==0&&b%i==0)
               {
                   c=i;
               }
           }
       }
       else
       {
           for(int i=1;i<=a;i++)
           {
               if(a%i==0&&b%i==0)
               {
                   c=i;
               }
           }
       }
          System.out.println("BCNN " +a*b/c);
    }
}
