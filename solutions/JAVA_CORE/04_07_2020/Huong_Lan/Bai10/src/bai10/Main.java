/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        int n_dao = 0;
        int i = 0;
        int m = n;
        while (m != 0) {
            i++;
            m = m / 10;

        }
        int a=n;
        while (a != 0) {
            n_dao = n_dao + (a % 10) * (int) Math.pow(10, i-1);
            a = a / 10;
            i--;
        }
        if (n == n_dao) 
            System.out.println(n+ " la so doi xung");
        else     System.out.println(n+ " khong la so doi xung");
        
    }

}
