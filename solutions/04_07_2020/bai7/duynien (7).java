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
public class bai7 { 
    public static  int finaboci(int n){
        if(n==0||n==1)
            return n;
        return finaboci(n-1)+finaboci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("nhap so:");
        int n=new Scanner(System.in).nextInt();
        System.out.print(finaboci(n));
    }
}
