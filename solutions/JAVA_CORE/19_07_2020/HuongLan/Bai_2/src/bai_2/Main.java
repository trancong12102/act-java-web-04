/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        int max = a[0];
        for (int i = 0; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Phan tu lơn nhat la " + max);
        int min = a[0];
        for (int i = 0; i < 5; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println("Phan tu nho nhat la " + min);
        System.out.println("Cac phan tu chia het cho 3 la:");
        for (int i = 0; i < 5; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + "\t");
            }
        }
    }

}
