/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arr2;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class ex2 {

    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        int[][] arr = new int[3][3];
        
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ma tran dau tien: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d]: \n", i + 1, j + 1);
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Nhap vao ma tran thu 2: ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("b[%d][%d]: \n", i + 1, j + 1);
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Tong cua 2 ma tran A va B la C:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%d\t", arr[i][j]);
                arr[i][j] = 0;
            }
            System.out.println("");
        }
        System.out.println("Tich cua 2 ma tran A va B la D:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] += arr1[i][j]*arr2[j][i];
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%d\t", arr[i][j]);
                arr[i][j] = 0;
            }
            System.out.println("");
        }
        
    }
}
