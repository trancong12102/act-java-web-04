/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg9;

import java.util.Scanner;

/**
 *
 * @author linhb
 */
public class BAI59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double n, i, s = 0,x;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n= ");
        n = input.nextDouble();
        System.out.println("Nhap x= ");
        x = input.nextDouble();
        for(i=1; i<=n;i++)
            s  =  s+ Math.pow(x, i);
            System.out.println("giá trị của GT  là:" + s);
    }
    
}
