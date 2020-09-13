
package javaapplication1;

import java.util.Scanner;

public class Bai3p2 {
    public static void main(String[] args) {
        System.out.print("Nhap so luong so nguyen to dau tien can in ra: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = 1;
        System.out.printf("%d so nguyen to dau tien la: ", n);
        for (int i = 0;i < n;i++) {
            p++;
            int m = 0;
            for (int j = 2;j < p;j++) {
                if(p%j==0) {
                m++;
                }
            }
            if (m==0) {
                System.out.printf("%d ", p);
            }
            else {
                i = i-1;
            }
        }
    }
}
