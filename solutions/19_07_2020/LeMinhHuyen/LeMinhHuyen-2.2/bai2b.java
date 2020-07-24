
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DaiPhongPC
 */
public class bai2b {
    public static void main(String[] args) {
              Scanner input = new Scanner(System.in); 
        // Khai bao hai ma tran goc
        int[][] A = new int[3][3]; 
        int[][] B = new int[3][3]; 
        // Ma tran tong la 
        int[][] C = new int[3][3]; 
        // Nhap vao gia tri cua ma tran A
        System.out.println("Nhap vao gia tri cua ma tran A"); 
        for(int i =0; i<3;i++){
            for(int j=0;j<3;j++ ){
                System.out.printf("Nhap vao phan tu A[%d][%d]\n ",i,j);
                A[i][j]= Integer.parseInt(input.nextLine().trim()); 
                
            }
        }
        // Nhap vao gia tri cua ma tran B
        System.out.printf("\n");
        System.out.println("Nhap vao gia tri cua ma tran B");
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.printf("Nhap vao phan tu B[%d][%d]\n",i,j); 
                B[i][j]= Integer.parseInt(input.nextLine().trim()); 
                
            }
        }
        // Xuat ra ca A va B 
        System.out.printf("\n"); 
        System.out.println("Ma tran A la:");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(A[i][j]+"\t");
                
            }
            System.out.printf("\n"); 
        }
        System.out.printf("\n"); 
        System.out.println("Ma tran B la:");
        for(int i=0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.print(B[i][j]+"\t");
                
            }
            System.out.printf("\n"); 
        }
        // Tim tich hai ma tran 
        for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    C[i][j] = 0;
                    for (int k = 0; k < 3; k++) {
                        C[i][j] = C[i][j] + B[k][j] * A[i][k];
                    }
                }
            }
        // In ra ma tran tich 
          System.out.println("Ma trận tích C: ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(C[i][j] + "\t");
                }
                System.out.println("\n");
            }
    }
}
