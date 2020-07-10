/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg7;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n, i, s = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n = input.nextDouble();
        for(i=1; i<=n;i++)
            s  =  s+  (2*i+1)/(2*i+2);
            System.out.println("giá trị của GT  là:" + s);
    }
    
}
