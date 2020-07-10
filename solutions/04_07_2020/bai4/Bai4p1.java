
package javaapplication1;

import java.util.Scanner;

public class Bai4p1 {
    public static void main(String[] args) {
        System.out.println("Nhap so: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int max = a;
        while (a!=0){
            if (a==0){
                break;
            }
            else {
                a = input.nextInt();
                if (max<a) {
                    max = a;
                }
            }
        }
        System.out.println("So lon nhat la: " +max);
    }
}
