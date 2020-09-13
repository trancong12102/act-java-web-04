/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import java.util.Scanner;

/**
 *
 * @author oOOo
 */
public class mang1chieu3 {
    public static void main(String[] args) {
        int a[]=new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.println("nhap phan tu:");
            a[i]=new Scanner(System.in).nextInt();
            
        }
        System.out.println("nhap n:");
        int n=new Scanner(System.in).nextInt();
        int  vitri=-1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==n)
            vitri=i;
        }
        if(vitri==-1){
            
        
        System.out.println("khong co n trong mang");
        }
        else{
            System.out.println("vi tri cua n:"+vitri);
        }
         
    }
}
