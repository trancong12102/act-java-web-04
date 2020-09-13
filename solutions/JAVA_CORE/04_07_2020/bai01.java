/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5_7;

import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class bai01 {
    private static Scanner scanner = new Scanner(System.in);
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = bai01.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = bai01.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        bai01.giaiPTBac2(a, b, c);
    }
     
    /**
     * Giải phương trình bậc 2: ax2 + bx + c = 0
     * 
     * @param a: hệ số bậc 2
     * @param b: hệ số bậc 1
     * @param c: số hạng tự do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b*b - 4*a*c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
