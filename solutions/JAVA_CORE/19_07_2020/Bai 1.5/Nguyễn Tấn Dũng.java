/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1.pkg5;

import java.util.Scanner;

public class Bai15 {

    public static void nhapmang(int[] x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap toa do x,y,z:");
        for (int i = 0; i < x.length; i++) {
            x[i] = input.nextInt();
        }

    }

    public static void xuatmang(int[] x) {
        System.out.println("Toa do la:x,y,z:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("%d\t", x[i]);
        }
    }
    public static void tongvecto(int []x,int []y)
    {   
        int []sum = new int [3];
        for(int i=0;i<x.length;i++)
        {
            sum[i]=x[i]+y[i];
            System.out.printf("%d\t",sum[i]);
        }
    }
    public static void tichhaivecto(int []x,int []y)
    {   
        int tichvecto=0;
        int []sum = new int [3];
        for(int i=0;i<x.length;i++)
        {
            sum[i]=x[i]*y[i];
            tichvecto+=sum[i];
        }
        System.out.println("Tich hai vecto la :"+tichvecto);
    }
    public static void main(String[] args) {
        System.out.println("Nhap toa do A:");
        int A[] = new int[3];
        nhapmang(A);
        xuatmang(A);
        System.out.println("\nNhap toa do B:");
        int B[] = new int[3];
        nhapmang(B);
        xuatmang(B);
        System.out.println("\nTong hai toa do A+B la:");
        tongvecto(A,B);
        System.out.println("\nTich cua hai vecto la:");
        tichhaivecto(A,B);
    }

}
