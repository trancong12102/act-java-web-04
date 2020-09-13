/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HL94NVT
 */
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] numbers = new int[15];
        for(int i=0;i<numbers.length;i++)
        {
            numbers[i] = rd.nextInt(100);
        }
        // sap xep mang theo thu tu tang dan
        int temp;
        for(int i =0 ; i<numbers.length-1;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                if(numbers[i]>numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Mang sap xep theo thu tu tang dan : ");
        for(int number : numbers)
            System.out.printf(" %d ",number);
        System.out.println("    ");
        //sap xep mang theo thu tu giam dan
        for(int i =0 ; i<numbers.length-1;i++)
        {
            for(int j=i;j<numbers.length;j++)
            {
                if(numbers[i]<numbers[j])
                {
                    temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println("Mang sap xep theo thu tu giam dan : ");
        for(int number : numbers)
            System.out.printf(" %d ",number);
        System.out.println("    ");
        int tongSoChan=0;
        int tongSoLe=0;
        for(int number : numbers)
        {
            if(number%2==0)
                tongSoChan+=1;
            else
                tongSoLe+=1;
        }
        System.out.printf("Tong so chan trong mang la : %d \n",tongSoChan);
        System.out.printf("Tong so le trong mang la : %d\n",tongSoLe);


    }
    
}
