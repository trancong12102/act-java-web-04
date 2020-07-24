/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai2 {

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
        int max=numbers[0];
        int min=numbers[0];
        for(int number : numbers)
        {
            if(number>=max)
                max = number;
            if(number<=min)
                min=number;
        }
        System.out.println("So lon nhat va nho nhat trong mang la : ");
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Cac phan tu trong mang chia het cho 3 : ");
        for(int number : numbers)
        {
            if(number % 3 == 0)
                System.out.printf(" %d ",number);
        }
        System.out.println("");

    }
    
}
