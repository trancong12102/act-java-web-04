/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Scanner;



/**
 *
 * @author vieth
 */
public class Test2 
 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        gt2(n);
       
    }
    public static int gt1(int n)
    {
        if (n==0)
        {
            return 1;
        }
        else
        {
            return n*gt1(n-1);
        }
    }
   
    public static void gt2(int n)
    {
        int p=1,i=1;
        if (n==0)
        {
            System.out.println(1);
        }
        else
        {
        while(i<=n)
        {
            p=p*i;
            i++;
        }
            System.out.println(p);
        }
    }
    
    
}
