/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap day so cua ban nao:");
        int arr1= sc.nextInt();
        int arr2=arr1, mid;
        int arr3=arr1;
        arr1=0;
        while(arr2!=0)
        {
           mid= arr2%10;
           arr2/=10;
           arr1=arr1*10+mid;
        }
        if(arr1!=arr3)
        {
            System.out.println("It is'nt ...");
        }
        else
        {
            System.out.println("It is ...");
        }
        
    }
    
}
