/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.demo.java04;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class newjava_10 {
    public static void main(String[] args){
        Scanner DX = new Scanner(System.in);
        System.out.print("Nhap chuoi can kiem tra >:");
        int n = DX.nextInt();
        int dn=0;
        int bl;
        int Na=n;
        while(Na != 0){
            bl= Na%10;
            dn=dn*10+bl;
            Na=Na/10;
            
        }
        if(dn == n ){
            System.out.printf("%d  day so doi xung",n);
        }else{
            System.out.printf("%d day so khong doi xung",n);
        }
        
    }
    
}
