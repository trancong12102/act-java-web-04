/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession2;

import java.util.Scanner;

/**
 *
 * @author luuthanhcong
 */
public class B6 {
    public static void main(String[] args){
        int num1, num2, ucln, bcnn;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        num1 = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        num2 = (int)scanner.nextInt();
        scanner.close();
        while (num1 != num2) {
            if(num1 > num2)
                num1 -= num2;
            else
                num2 -= num1;
        }
        ucln = num1;
        System.out.printf("Ước chung lớn nhất là : " + num1);
        System.out.println("Bội chung nhỏ nhất là : " +(num1 + num2)/ucln);
    }
}