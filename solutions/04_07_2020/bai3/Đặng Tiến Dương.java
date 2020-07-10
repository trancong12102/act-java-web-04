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
public class Bai3a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào 1 số: ");
        int n= input.nextInt();
        int dem=0;
        if(n<=2){
            System.out.println(n+" Không phải là số nguyên tố");
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                dem++;
            }
        }
        if(dem<=2){
            System.out.println(n +" Số này là số nguyên tố");
        }else
            System.out.println(n+" Số này không phải là số nguyên tố");
        }
    }         

