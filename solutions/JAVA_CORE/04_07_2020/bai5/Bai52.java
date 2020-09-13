/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg2;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n= sc.nextInt();
        float S=0;
        for(int i=1;i<=n;i++)
        {
            S+=i;
        }
        System.out.println("tong S=" +S);
    }
    
}
