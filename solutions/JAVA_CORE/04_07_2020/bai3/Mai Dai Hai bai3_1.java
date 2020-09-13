/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10_6;
import java.util.Scanner;
/**
 *
 * @author topmu
 */
public class bai3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số nguyên n");
        int n = input.nextInt();
        int dem = 0;
        if (n==0 | n==1) 
        {    
            System.out.println(n+" khong phai so nguyen to");
        }    
        
            else
           {
             
            int i;         
                for (i=1;i<=n;i++)
                { 
                    if (n%i==0)
                    {
                        dem++;
                    }
                    }
                 
        
        
            if (dem > 2)
            {
                System.out.println(n+" không phải là số nguyên tố");            
            }
            else
            {
                System.out.println(n+" là số nguyên tố"); 
            }
           }
    }   
}
