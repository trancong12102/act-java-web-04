/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap n: ");
        int n = Integer.parseInt(input.nextLine());
        int ft = 1;
        
        System.out.println("---- Tinh gia thua cua so nguyen duong n ---- ");
        
        for(int i = 1; i <= n; i++){
            ft = ft * i;
        }
        
        System.out.printf("Gia tri %d! la %d  \n", n, ft);
    }
    
}
