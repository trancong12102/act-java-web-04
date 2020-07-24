/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1_mang_1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_1_Mang_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];

        System.out.println("--- Nhap vao cac phan tu cua mang ---");
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Array[%d] = ",i);
            A[i] = input.nextInt();
        }

        System.out.println("--- Mang vua nhap ---");
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %d ",A[i]);
        }
        System.out.print("\n");

        int sum = 0, sumEven = 0, sumOdd = 0;
        for (int i = 0; i < 5; i++) {
            sum += A[i];
            if(i % 2 == 0){
                sumEven += A[i];
            } else {
                sumOdd += A[i];
            }
        }
        System.out.printf("Tong cac phan tu trong mang = %d \n",sum);
        System.out.printf("Tong cac phan tu le trong mang = %d \n",sumOdd);
        System.out.printf("Tong cac phan tu chan trong mang = %d \n",sumEven);

    }
    
}
