/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg8;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                  Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n= sc.nextInt();
        double S=1;
        double D=0;
        for(int i=1;i<=n;i++)
        {
           S*=i;
           D+=S;
        }
        System.out.println("tong D=" +D);
    }
    
}
