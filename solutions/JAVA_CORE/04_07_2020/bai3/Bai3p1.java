
package javaapplication1;

import java.util.Scanner;

public class Bai3p1 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = 0;
        for (int i = 2;i < n;i++) {
            if(n%i==0) {
                m++;
            }
        }
        if (m==0) {
            System.out.printf("So %d la so nguyen to\n", n);
        }
        else{
            System.out.printf("So %d khong phai la so nguyen to\n", n);
        }
    }
}
