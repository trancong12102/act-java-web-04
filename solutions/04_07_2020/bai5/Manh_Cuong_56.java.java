/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class bai56 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so n=");
        float S=0;
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i= 2;i<=n;i++)
        {
            S+=1/(float)(i*(i+1));
        }
        System.out.println("Tong la: "+S);
    }

}
