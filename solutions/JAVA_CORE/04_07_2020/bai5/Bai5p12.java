
package javaapplication1;

import java.util.Scanner;

public class Bai5p12 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double s = 0;
        double m = 0;
        for (double i = 1;i <= n;i++){
            m = m + i;
            s = s + 1/m;
        }
        System.out.println("Tong S = " +s);
    }
}
