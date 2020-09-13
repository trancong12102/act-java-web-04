/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5_7;

import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class bai10 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số nguyên: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int m=n;
        int soDao=0, donvi;
        while(n!=0){
            donvi = n % 10;
            soDao = (soDao * 10) + donvi;
            n = n/10;
        }
        if(soDao==m)
            System.out.println("Đây là sô đối xứng");
        else
            System.out.println("Đây không phải là số đối xứng");
        
    }
}
