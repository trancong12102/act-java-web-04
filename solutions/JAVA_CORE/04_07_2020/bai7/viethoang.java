/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phibonaci;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Phibonaci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int n;
        System.out.println("Nhap n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Kq:"+phibonaci(n));
    }
    public static int phibonaci(int n)
    {
        if (n==0||n==1)
        {
            return 1;
        }
        else
            return phibonaci(n-1)+phibonaci(n-2);
    }
    
}
