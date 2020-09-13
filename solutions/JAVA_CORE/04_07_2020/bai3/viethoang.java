/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Songuyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap n:");
        n=sc.nextInt();
        ktsonguyento(n);
        nsont(n);
        
        
    }
    public static void nsont(int n)
    {
        int i=1,t=1;
        while (i<=n)
        {
            if (ktsnt(t))
            {
                System.out.print(t+" ");i++;
            }
            t++;
        }
        
    }
    public static void ktsonguyento(int n)
    {
        boolean kt=true;int i=2;
        if ((n>1)&&(n<=3))
        {
            System.out.println("La so nguyen to");
        }
        else
        {
        while (i<=n-1)
        {
            if (n%i==0)
            {
                kt=false;
                break;
            }
            i++;
        }
        if(kt)
        {
            System.out.println("La so nguyen to");
        }
        else
        {
            System.out.println("ko la so nguyen to");
        }
        }
    }
    public static boolean ktsnt(int a)
    {
        int i=2;
        if ((a>1)&&(a<=3))
        {
            return true;
        }
        else
            if (a==1)
            {
                return false;
            }
        else
        {
        while (i<=Math.abs(a/2))
        {
            if (a%i==0)
            {
                return false;
            }
            i++;
        }
        
        }
        return true;
    }
}
    

