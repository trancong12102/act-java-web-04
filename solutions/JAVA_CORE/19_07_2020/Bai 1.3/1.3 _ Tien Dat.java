/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3_mang_1;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_3_Mang_1 {

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

        System.out.print("Nhap a > ");
        int a = input.nextInt();
        for(int i = 0; i < A.length; i++){
            if(A[i] == a){
                System.out.printf("So nguyen %d co xuat hien trong mang o vi tri > A[%d] \n",a,i);
            }
        }
    }
}
