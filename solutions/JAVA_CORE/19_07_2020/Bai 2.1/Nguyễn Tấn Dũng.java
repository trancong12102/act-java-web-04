/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai21 {

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
    public static void tonghang(int[][] x) {
        int hang =0;
        {
           for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                    hang+= x[i][j];
                }
            System.out.printf("\nTong hang thu %d co tong la: %d",i+1,hang);
            }
        }
    }
    public static void tongcot(int[][]x){
        int cot =0;
        {
           for (int j = 0; j < x.length; j++) {
            for (int i = 0; i < x.length; i++) {
                    cot+= x[i][j];
                }
            System.out.printf("\nTong cot thu %d co tong la: %d",j+1,cot);
            }
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
        System.out.println("Tong hang A la:");
        tonghang(A);
        System.out.println("\nTong hang B la:");
        tonghang(B);
        System.out.println("Tong cot A la:");
        tongcot(A);
        System.out.println("\nTong cot B la:");
        tongcot(B);
    }

}
