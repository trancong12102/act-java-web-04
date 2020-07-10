/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class bai10 {
    public static void main(String[] args) {
        int a,i = 1;
        int palindrome=0;
        System.out.println("nhap so:");
        a=new Scanner(System.in).nextInt();
        int b=a;
        do{
            int du=a%10;
            palindrome=palindrome*10+du;
            a/=10;
        }while(a>0);
        if(b==palindrome)
        System.out.println("la so doi xung");
        else
        System.out.println("khong phai so doi xung");
    }
}
