
package javaapplication1;

import java.util.Scanner;

public class Bai5p7 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        double s = 0;
        for (double i = 0;i <= n;i++){
            s = s + ((2*i)+1)/((2*i)+2);
        }
        System.out.println("Tong S = " +s);
    }
}
