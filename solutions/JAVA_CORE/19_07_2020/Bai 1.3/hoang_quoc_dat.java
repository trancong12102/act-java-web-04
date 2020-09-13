/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        for(int i=0; i <numbers.length;i++)
        {
            System.out.printf("\nNhap vao phan tu thu %d cua mang : ", i+1 );
            numbers[i]= sc.nextInt();
        }
        // in
        System.out.println("\nMang vua nhap la : ");
        for(int number: numbers)
        {
            System.out.printf(" %d ",number);
        }
       System.out.println("\nNhap vao so a can xac dinh : ");
       int a = sc.nextInt();
       boolean result=true;
       for(int i=0; i <numbers.length;i++)
       {
           if(numbers[i] == a)
           {
               result = false;
               System.out.printf("So %d co xuat hien trong mang o vi tri thu : %d cua mang\n ", a , i+1 );
           }
       }
       if(result)
            System.out.printf("%d khong xuat hien trong mang.\n",a);

    }
    
}
