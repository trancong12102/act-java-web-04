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
public class Bai_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        
        boolean ketQua=true;
        
        if(n < 2)
           System.out.printf("%d khong phai la so nguyen to ! \n", n);
        else
        {
            for(int i = 1; i <= Math.sqrt(n); i++)
            {
                if(n % i == 0 && i != 1 && i != n)
                {
                    ketQua=false;
                    break;
                }
            }
            if(!ketQua)
                System.out.printf("%d khong phai la so nguyen to ! \n", n);
            else
                System.out.printf("%d la so nguyen to ! \n", n);
        }
    }
}
