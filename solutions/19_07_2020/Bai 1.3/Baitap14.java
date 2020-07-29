/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap14;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        for (i = 0; i < arr.length; i++) {
            System.out.println("nhap gia tri vao mang");
            arr[i] = new Scanner(System.in).nextInt();

        }
        System.out.println("gia tri vua khoi tao ");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("nhap a");
        int a = new Scanner(System.in).nextInt();
        boolean vitri = false;
        //int viTri = -1;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                vitri = true;
                break;
            }

        }
        if (vitri == true) {
            System.out.println("vi tri" + i);
        } else {
            System.out.println("ko co trong mang");
        }

    }
}
