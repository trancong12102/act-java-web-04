
package javaapplication1;

import java.util.Scanner;

public class Bai5p8 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long s = 0;
        long m = 1;
        for (int i = 1;i <= n;i++){
            m = m * i;
            s = s + m;
        }
        System.out.println("Tong S = " +s);
    }
}
