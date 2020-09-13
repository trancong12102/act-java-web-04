/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap.java_04.pkg3;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class BaitapJava_043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so nguyen duong n:");
        int n = input.nextInt();
        int s =1;
        for(int i=1;i<=n;i++)
        {
            
            s*=i;
        }
       
        System.out.println("giai thua cua x la " +s);
    }
    
}
