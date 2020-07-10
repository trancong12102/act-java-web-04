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
public class bai2 {
    public static void main(String[] args) {
        
    
    int n=new Scanner(System.in).nextInt();
    int giaithua = 1;
    for(int i=1;i<=n;i++){
       giaithua*=i;
    }
        System.out.println(giaithua);
}
}
