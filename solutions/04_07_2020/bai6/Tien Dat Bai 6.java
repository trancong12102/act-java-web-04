/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print(" Nhap a: ");
        int a = input.nextInt();
        System.out.print(" Nhap b: ");
        int b = input.nextInt();
        
        System.out.println("---- Uoc chung lon nhat ---");
        int temp1 = a;
        int temp2 = b;
        while(temp1 != temp2){
            if (temp1 > temp2){
                temp1 -= temp2;
            } else {
                temp2 -= temp1;
            }
        }
        int gcd = temp1;
        System.out.println(gcd + " la uoc chung lon nhat giua " + a + " va " + b);
        
        System.out.println("---- Boi chung nho nhat ---");
        int lcm = (a*b)/gcd;
        System.out.println(lcm + " la boi chung nho nhat giua " + a + " va " + b);
    }
}
