/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //khoi tao phan tu
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        //Khoi tao gia tri cho phan tu 
        int[] mang = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("gia tri phan tu la: ");
            mang[i] = sc.nextInt();
        }
        //tinh tong
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += mang[i];
        }

        // in tong 
        System.out.print("Tong cua mang la: " + sum);
        int sumc = 0, suml = 0;
        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 1) {
                suml += mang[i];
            } else {
                if (mang[i] % 2 == 0) {
                    sumc += mang[i];
                }
            }

        }
        System.out.println("Tong chan cua mang la  "+sumc);
        System.out.print("tong le cua mang la "+suml);

    }

}
