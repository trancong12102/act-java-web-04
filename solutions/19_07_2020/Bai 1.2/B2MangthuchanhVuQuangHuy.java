/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.mangthuchanh;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai2Mangthuchanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
    int s=0;
        System.out.println("Nhap cac gia tri phan tu trong mang:");
        for(int i = 0; i< arr.length; i++)
        {
           arr[i] = input.nextInt();
        }
        int max = arr[0]; 
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i]>max)
            { 
                max=arr[i];
            }
            
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
                System.out.println("gia tri lon nhat la:"+max +"\ngia tri nho nhat la:"+min);
                
                // tìm và hiển thị các phần tử trong mảng chia hết cho 3
    System.out.println("Các phần tử chia hết cho 3 là: ");
    for (int i = 0; i < arr.length; i++) 
    {
        if (arr[i] % 3 == 0) 
        {
            System.out.print(arr[i] + "\t");
        }
        // TODO code application logic here
    }
    
}
}
