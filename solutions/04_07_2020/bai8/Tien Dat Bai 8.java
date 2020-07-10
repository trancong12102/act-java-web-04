/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_8;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        int x = input.nextInt();
        double degree = (x*Math.PI)/180;
        
        double sin = degree;
        double e = 0;
        int ft = 1;
        int n = 1;
        
        for ( int y = 1; y <= 10000; y++) {
            for (int i = 1; i <= (2*n+1); i++) {
                ft = ft * i;
            }
            
            e = Math.pow((-1.0),n) * (Math.pow(degree,(2*n+1)) / ft);
            sin += e;
            n++;
            
            if ( Math.abs(e) <= 0.0001) {
                break;
            }
        }
        
        System.out.printf("sin %d = %f \n",x,sin);
    }
}
