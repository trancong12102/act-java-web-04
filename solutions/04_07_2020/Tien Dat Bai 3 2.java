/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_3;

import java.util.Scanner;

/**
 *
 * @author King Midas
 */
public class Bai_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = input.nextInt();
        
        int dem = 0;
        
        for(int i = 2; i < 10000; i++)
        {
            boolean ketQua = true;
            for(int j = 2; j <= Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    ketQua = false;
                    break;
                }
            }
            if(ketQua){
                System.out.printf(" %d ", i);
                dem ++;
            }
            if (dem == n){
                System.out.printf(" \n ");
                return;
            }
        }
    }
}   
