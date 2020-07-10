
package javaapplication1;

import java.util.Scanner;

public class Bai5p2 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int s = 0;
        for (int i = 1;i <= n;i++){
            s = s + i;
        }
        System.out.println("Tong S = " +s);
    }
}
