/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap a");
        int a= sc.nextInt();
        System.out.println("nhap b");
        int b= sc.nextInt();
        if(a==b)
        {
            System.out.println("Hai so nay bang nhau vi vay UCLN se la: a=b= "+a);
        }
        else if(b<a)
        {
            for(int i=b;i>=1;i--)
            {
                if(a%i==0&&b%i==0)
                {
                    System.out.println("UCLN cua 2 so tren la: "+i);
                    System.out.println("BCNN la: "+(a*b/i));
                    break;
                }
            }

        }
        else
        {
          for(int i=a;i>=1;i--)
            {
                if(a%i==0&&b%i==0)
                {
                    System.out.println("UCLN cua 2 so tren la: "+i);
                    System.out.println("BCNN la: "+(a*b/i));
                    break;
                }
            }
          
        }
        
    }
    
}
