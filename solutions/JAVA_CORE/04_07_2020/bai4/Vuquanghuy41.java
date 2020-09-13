/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Bai 4: nhap so nguyen -> 0, in ra max min");
        System.out.print("Nhap N: ");
         int n= sc.nextInt();
         int  max= n,min =n;
         while(n!=0)
         {
             System.out.print("Nhap tiep N: ");
              n= sc.nextInt();
             if(max <n)
                 max=n;
             if(min > n&& n!=0)
                 min =n ;
         }
         System.out.println("\nMax = "+ max);
         System.out.println("Min = "+ min);
        // TODO code application logic here
    }
    
}
