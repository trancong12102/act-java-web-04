/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số nguyên dương a = ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên dương b = ");
        int b = scanner.nextInt();
        
        System.out.println("UCLN của " + a + " và " + b
                + " là: " + UCLN(a, b));
       
        System.out.println("BCNN của " + a + " và " + b
                + " là: " + BCNN(a, b));
    }
    public static int UCLN(int a, int b) {
        if (b == 0) return a;
        return UCLN(b, a % b);
    }
     
    public static int BCNN(int a, int b) {
        return (a * b) / UCLN(a, b);
    }
}
 