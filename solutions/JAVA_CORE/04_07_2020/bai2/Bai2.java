
package javaapplication1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.print("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long s = 1;
        for (int i=1;i<=n;i++) {
            s = s*i;
        }
        System.out.println("Giai thua cua n la n! = " +s);
    }
}
