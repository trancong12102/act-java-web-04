/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhap so ma ban muon kiem tra: ");
        Scanner sc= new Scanner(System.in);
        int count=0;
        int inter = sc.nextInt();
        if(inter<=1)
        {
            System.out.println("So nay khong phai so nguyen to");
        }
        for(int i=2;i<=inter;i++)
        {
            if(inter%i==0)
            {
               count++;
            }
        }
        if(count<=2)
        {
            System.out.println("So nay la so nguyen to");
        }
        else
        {
            System.out.println("So nay khong phai so nguyen to");
        }
        
    }
    
}
