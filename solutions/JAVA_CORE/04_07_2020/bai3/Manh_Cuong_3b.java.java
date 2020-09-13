/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05.pkg07.pkg2020;


import java.util.Scanner;

/**
 *
 * @author green
 */
public class NewClass {
public static void main(String[] args) 
{
    int dem = 1;
    int so=2;
    System.out.println("Nhap so n= ");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    while(dem<=n)
        {
            int count =0;
            for(int i=1; i<=so; i++)
            {
               if(so%i==0)
               {
                   count ++;
               }
            }
            if(count==2)
            {
                System.out.println(""+so);
                dem++;  
            }
            so++;
        }   
}
}
 