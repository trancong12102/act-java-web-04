/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai22 {

    public static void nhapmatran(int[][] x) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("X[%d][%d]=", i + 1, j + 1);
                x[i][j] = input.nextInt();
            }
        }
    }

    public static void xuatmatran(int[][] x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ma tran ban vua nhap la:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%d\t", x[i][j]);
            }
            System.out.println("");
        }
    }

    public static void tonghaimatran(int[][] x,int [][]y) {
        Scanner input = new Scanner(System.in);
        int[][] sum = new int[3][3];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                sum[i][j] += x[i][j]+y[i][j];
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%d",sum[i][j]);
            }
            System.out.println("");
    }
    }
    public static void tichhaimatran(int[][]x,int [][]y)
    {
        int[][] sum = new int[3][3];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                for (int k = 0; k < x.length; k++){
                    sum[i][j] += x[i][k]*y[k][j];
                }
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.printf("%d\t",x[i][j]);
            }
            System.out.printf("\n");
        }       
    }
    public static void main(String[] args) {
        System.out.println("Nhap ma tran A ");
        int A[][] = new int[3][3];
        nhapmatran(A);
        xuatmatran(A);
        System.out.println("Nhap ma tran B ");
        int B[][] = new int[3][3];
        nhapmatran(B);
        xuatmatran(B);
        System.out.println("Tong ma tran A+B la");
        tonghaimatran(A,B);
        System.out.println("Tong ma tran A*B la");
        tichhaimatran(A,B);
    }

}
