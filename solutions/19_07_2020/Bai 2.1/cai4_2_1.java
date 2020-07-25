/*
1. Nhập vào ma trận 2 chiều 3x3. In ra ma trận vừa nhập và 
a. Tính tổng mỗi hàng của ma trận và in ra 
b. Tính tổng mỗi cột của ma trận và in ra
 */
package bai4;

import java.util.Scanner;

public class cai4_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int[3][3];
        System.out.println("Nhap ma tran A ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Nhap A[%d][%d]= ",i,j);
                A[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma tran vua nhap");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d   ",A[i][j]);
            }
            System.out.println("\n");
        }
        int[] Tonghang = new int[3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                Tonghang[i] += A[i][j]; 
            }
        }
        for (int i = 0; i < A.length; i++) {
                System.out.printf("Tong hang %d : %d \n",i+1,Tonghang[i]);
        }
        System.out.println("\n");
        int[] Tongcot = new int[3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                Tongcot[j] += A[i][j]; 
            }
        }
        for (int i = 0; i < A.length; i++) {
                System.out.printf("Tong cot %d : %d \n",i+1,Tongcot[i]);
        }
        System.out.println("\n");
    }
        
}
