/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktsnt;
import java.util.Scanner;
/**
 *
 * @author linhb
 */
public class KTSNT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n;
        Scanner Ktra = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n= Ktra.nextInt();
        if(n<2){
            System.out.println("Không phải là số nguyên tố");
        }
        int count=0;
        int b= (int) Math.sqrt(n);
        for (int i=2; i<=b; i++)
            if(n%i==0)
            {
                count ++;
               
            }
        if (count ==0)
        {
            System.out.println("Là số nguyên tố");
            
        }
        else 
            System.out.println("Không phải là số nguyên tố" );
        
        }

}
