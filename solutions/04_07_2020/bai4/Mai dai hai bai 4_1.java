/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

/**
 */
package b10_6;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class Bai41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Chào mừng bạn đến với hãy nhập số đúng");
        System.out.println("Nhập số nguyên n ");
        int n=input.nextInt();
        int max = n;
        if(n==0){
            System.out.println("bạn đã chọn đúng số");
            System.out.printf("Số lớn nhất là"+n);
        }
        while(n!=0){
            System.out.println("nhập tiếp số nguyên n");
            n = input.nextInt();
            if (max<n){
                max=n;
            }
            if(n==0){
            System.out.println("bạn đã chọn đúng số");
            System.out.println("Số lớn nhất là "+max);
        }
        }
    }
    
}
