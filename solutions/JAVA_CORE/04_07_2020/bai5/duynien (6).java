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
public class bai5 {
    public static void main(String[] args) {
        System.out.println("nhap a:");
        int a=new Scanner(System.in).nextInt();
        System.out.println("nhap b:");
        int b=new Scanner(System.in).nextInt();
        int t=a*b;
        while(a!=b){
            if(a>b)
                a=a-b;
            else b=b-a;
        }
        int ucln=a;
        System.out.println("UCLN:"+ucln);
        System.out.println("BCNN"+t/ucln);
    }
}
