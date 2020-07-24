/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

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
        Scanner input = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        System.out.println("Nhap so n:");
        int n = input.nextInt();
        int vt = -1, flag = 0;
        for (int j = 0; j < 5; j++) {
            if (a[j] == n) {
                vt = j;
                flag++;
                break;
            }
        }
        if (flag != 0) {
            System.out.println("Vi tri cua so " + n + " trong mang la: " + (vt+1));
        } else {
            System.out.println("Khong ton tai so " + n + " trong mang");
        }
    }

}
