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
public class bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số các giá trị của Mảng: ");
        int n= input.nextInt();
        int A[] = new int[n];
        System.out.print("Nhập các giá trị của Mảng: ");    
        for (int i=0;i<A.length;i++){
            A[i] = input.nextInt();
            System.out.print("- ");
        }
        int Max=A[1];
        int Min=A[1];
        System.out.printf("Các phần tử chia hết cho 3 trong mảng: ");
        for (int i=0;i<A.length;i++){
            if(A[i]>Max){
                Max=A[i];
            }
            if(A[i]<Min){
                Min=A[i];
            }
            if(A[i]%3==0){
 
                System.out.printf(A[i]+", ");
            }
        }
        System.out.println("phần tử lơn nhất Max= "+Max);
        System.out.println("phần tử nhỏ nhất Min= "+Min);
    }
    
}
