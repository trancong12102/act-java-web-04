/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg1;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai1 {

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
        //tinh tong cac phan tu trong mang:
        int tong=0;
        int tongChan=0;
        int tongLe=0;
        for(int number: numbers)
        {
            tong+=number;
            if(number%2==0)
            {
                // tinh tong cac phan tu chan cua mang
                tongChan+=number;
            }
            else
            {
                  // tinh tong cac so le
                tongLe+=number;
            }
        }
        System.out.printf("\nTong cac phan tu trong mang la : Tong = %d\n", tong);
        System.out.printf("Tong cac phan tu chan trong mang la : Tong = %d\n", tongChan);
        System.out.printf("Tong cac phan tu le trong mang la : Tong = %d\n", tongLe);

    }
    
}
