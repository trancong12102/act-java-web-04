/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Baitap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        int gt = 1;
        for(i=1;i<=n;i++){
            gt*=i;
        }
        System.out.printf("giai thua cua %d la ",gt);
        
        
        
    }
    
}
