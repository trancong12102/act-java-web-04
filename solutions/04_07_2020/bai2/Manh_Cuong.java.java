/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day05.pkg07.pkg2020;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Day05072020 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can tinh giai thua: n = ");
        int a = sc.nextInt();
        double fact = 1;
        int i=1;
        while(i<=a)
        {
            fact *=i;
            i++;
        }
        System.out.println("Voi so n vua nhap thi giai thua cua no la: " +fact);
        
    }   
}
