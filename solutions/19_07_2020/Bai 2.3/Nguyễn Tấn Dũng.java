/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2.pkg3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai23 {

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

    public static void kiemtra(int[][] x) {
        boolean matrandoixung=true;
        boolean matran0= true;
        int sodem = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if(i==j&&x[i][j]==1)
                {
                    sodem++;
                }
                if(x[i][j]!=0)
                {
                    matran0= false;
                }
                if(x[i][j]!=x[j][i])
                {
                    matrandoixung=false;
                }
            }

        }
        if(sodem==3)
                {
                    System.out.println("La ma tran don vi");
                }
                else
                {
                    System.out.println("Khong phai la ma tran don vi");
                }
        if(matran0==false)
        {
            System.out.println("Khong phai la ma tran 0");
        }
        else
        {
            System.out.println("La ma tran 0");
        }
        if(matrandoixung==false)
        {
            System.out.println("Khong phai la ma tran doi xung");
        }
        else
        {
            System.out.println("La ma tran doi xung");
        }
    }

    public static void main(String[] args) {
        int [][] A= new int [3][3];
        nhapmatran(A);
        xuatmatran(A);
        kiemtra(A);
    }

}
