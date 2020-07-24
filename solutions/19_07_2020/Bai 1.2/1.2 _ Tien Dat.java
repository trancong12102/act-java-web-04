/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2_mang_1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_2_Mang_1 {

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
        System.out.printf("\n");

        int max = A[0], min = A[0];

        for (int i = 0; i < 5; i++) {
            if(A[i] > max) {
                max = A[i];
            }
        }
        System.out.printf("Phan tu lon nhat trong mang > %d \n",max);

        for (int i = 0; i < A.length; i++) {
            if(A[i] < min) {
                min = A[i];
            }
        }
        System.out.printf("Phan tu nho nhat trong mang > %d \n",min);

        System.out.printf("Cac phan tu chia het cho 3 >");
        for (int i = 0; i < A.length; i++) {
            if(A[i] % 3 == 0) {
                System.out.printf(" %d ",A[i]);
            }
        }
        System.out.printf("\n");
    }
    
}
