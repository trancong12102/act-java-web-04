/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt19_7;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Nhập số các giá trị của Mảng: ");
        int n= input.nextInt();
        int A[] = new int[n];
        System.out.print("Nhập số a cần tìm trong Mảng: ");
        int a= input.nextInt();
        System.out.print("Nhập các giá trị của Mảng: ");    
        int j;
        for (int i=0;i<A.length;i++){
            A[i] = input.nextInt();
            System.out.print("- ");
        }
        for (int i=0;i<A.length;i++){
            if (a==A[i]){
                System.out.println(a+"có xuất hiện trong mảng trên");
                j=i+1;
                System.out.println("Vị trí của số cần tìm trong mảng là: "+j);
            }
        }
               
    }
    
}
