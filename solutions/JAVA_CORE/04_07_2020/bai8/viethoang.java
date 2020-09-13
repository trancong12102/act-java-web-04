/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamsin;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Hamsin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x,sin=0;int i=0;
        System.out.println("Nhap x:");
        Scanner sc=new Scanner(System.in);
        x=sc.nextDouble();
        while (Math.abs(sin-Math.sin(x))>0.0001)
        {
            sin=sin+Math.pow(-1, i)*Math.pow(x, 2*i+1)/gt(2*i+1);
            i++;
        }
        System.out.printf("Kq la:%08.4f\n",sin);
    }
   
    public static int gt(int n)
    {
        
        if (n==0)
        {
            return 1;
        }
        else return n*gt(n-1);
    }
    
    
}
