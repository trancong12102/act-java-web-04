/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap13;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap13 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int arr[] = new int[n];
        int max, min;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap gia tri phan tu");
            arr[i] = new Scanner(System.in).nextInt();

        }
        System.out.println("gia tri vua nhap");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        System.out.println("So lon nhat " + max);
        min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        System.out.println("So nho nhat " + min);
        System.out.print("So chia het cho 3 :");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.print(arr[i] + "  ");
            }
        }

    }
}
