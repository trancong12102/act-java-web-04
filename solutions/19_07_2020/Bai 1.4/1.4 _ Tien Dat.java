/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_4_mang_1;

import java.util.Random;

/**
 *
 * @author King Midas
 */
public class Bai_4_Mang_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random input = new Random();
        int[] A = new int[15];

        System.out.println("--- Mang vua khoi tao ---");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt(100);
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");

        int temp = 0, Even = 0, Odd = 0; 

        System.out.println("--- Mang duoc sap xep theo thu tu tang dan ---");
        for (int i = 0; i < (A.length - 1); i++) {
            for (int j = (i+1); j < A.length; j++) {
                if(A[i] > A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");


        System.out.println("--- Mang duoc sap xep theo thu tu giam dan ---");
        for (int i = 0; i < (A.length - 1); i++) {
            for (int j = (i+1); j < A.length; j++) {
                if(A[i] < A[j]){
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.printf(" %d ",A[i]);
        }
        System.out.printf("\n");

        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0){
                Even += 1;
            } else {
                Odd += 1;
            }
        }
        System.out.printf("Trong mang co %d so chan \n",Even);
        System.out.printf("Trong mang co %d so le \n",Odd);
    }
}
