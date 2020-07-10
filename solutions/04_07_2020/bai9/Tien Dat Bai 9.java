/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_9;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap gia tri x: ");
        int x = input.nextInt();
        double degree = (x*Math.PI)/180;
        
        double cos = 1;
        double sin = 0;
        double arr[] = new double[1000];
        arr[0] = 0;
        double e = 0;
        double z = 0;
        int ft = 1;
        int n = 1;
        
        for ( int y = 1; y <= 10000; y++) {
            for (int i = 1; i <= (2*n); i++) {
                ft = ft * i;
            }
            
            z = Math.pow((-1.0),n) * (Math.pow(degree,(2*n)) / ft);
            cos += z;
            arr[y] = Math.sqrt(1 - cos*cos);
            e = arr[y] - arr[y-1];
            n++;
            
            if ( Math.abs(e) <= 0.0001) {
                sin = arr[y];
                break;
            }
        }
        
        System.out.printf("sin %d = %f \n",x,sin);
    }
}
