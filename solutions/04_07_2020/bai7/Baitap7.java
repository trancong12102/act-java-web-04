/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap7;

import java.util.Scanner;



/**
 *
 * @author Dell
 */
public class Baitap7 {

    public static int fibonaci(int n){
        if(n<=1) return n;
        return fibonaci(n-1)+fibonaci(n-2);
    }
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        System.out.println("ket qua:"+fibonaci(n));
    }
}

