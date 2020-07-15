/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap10;

package javaapplication1;

import java.util.Scanner;

public class Bai4p2 {
    public static void main(String[] args) {
        System.out.println("Nhap so: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int min = a;
        while (a!=0){
            if (a==0){
                break;
            }
            else {
                a = input.nextInt();
                if (min>a) {
                    min = a;
                }
            }
        }
        System.out.println("So nho nhat la: " +min);
    }
}

