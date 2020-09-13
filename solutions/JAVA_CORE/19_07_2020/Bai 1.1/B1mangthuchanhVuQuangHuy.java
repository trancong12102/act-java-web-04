/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1mangthuchanh;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai1mangthuchanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    int[] arr = new int[5];
    int s=0;
        System.out.println("Nhap cac gia tri phan tu trong mang:");
        for(int i = 0; i< arr.length; i++)
        {
           arr[i] = input.nextInt();
        }
        for(int i =0; i< arr.length; i++)
        {
        s=s+arr[i];
        }
        System.out.println("A.Tong cac phan tu trong mang:" +s);
        s=0;
        for(int i=0; i<arr.length; i++)
        {  
            if(arr[i]%2==1)
            {
               s+=arr[i];
            }
            
        }
        System.out.println("B.Tong cac gia tri phan tu le trong mang:" +s);
        s=0;
        for(int i=0; i<arr.length; i++)
        {  
            if(arr[i]%2==0)
            {
               s+=arr[i];
            }
            
        }
        System.out.println("B.Tong cac gia tri phan tu chan trong mang:" +s);
        
        // TODO code application logic here
    }
           
    
}
