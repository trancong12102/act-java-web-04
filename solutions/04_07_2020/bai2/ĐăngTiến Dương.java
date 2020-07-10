/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    public static void main(String[] args) {
        int i;
        int j=1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
            j*=i;
            System.out.println("Giai thừa của "+n+ " là: "+j);
        

    }
        
    
}
