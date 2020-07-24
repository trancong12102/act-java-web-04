/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5array1;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class Bai5array1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // Nhap vao hai vecto 
        int[] A = new int[3];
        int[] B = new int[3];
        System.out.println("Moi nhap cac phan tu cua vecto A");
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(input.nextLine().trim());
        }
        System.out.println("Moi nhap vao cac phan tu cua vecto B");
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(input.nextLine().trim());
        }
        // Tinh tong cua hai vecto 
        int[] Sum = new int[3];
        for (int i = 0; i < Sum.length; i++) {
           Sum[i]= A[i]+B[i]; 
        }
        // In ra tong cua hai ma tran
        System.out.println("Tong cua hai ma tran A va B la");
        for (int i=0; i<Sum.length;i++){
            System.out.print(Sum[i]+ " ");
        }
        // Tích vô hướng của A và B 
        int tvh=0; 
        for(int i =0; i<A.length; i++){
            tvh +=A[i]*B[i]; 
        }
        System.out.println(" ");
        System.out.println("Tích vô hướng của A và B là "+tvh);
    }

 
