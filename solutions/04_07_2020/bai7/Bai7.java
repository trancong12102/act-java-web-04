/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so n: ");
        int n = sc.nextInt();
        int f1=1,f2=1,f3=0;
        if(n==0||n==1){
            f3=1;
        }else{
            for(int i=2;i<=n;i++)
            {
                f3=f2+f1;
                f1=f2;
                f2=f3;
            }
        }
        System.out.println("f("+n+")= "+f3);
    }
    
}
