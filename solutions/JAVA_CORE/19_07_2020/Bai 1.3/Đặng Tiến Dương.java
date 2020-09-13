/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1_3 {
    public static void main(String[] args) {
        int[] A ={12,20,30,26,40};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a:");
        int a=sc.nextInt();
        for(int i=0;i<A.length;i++){
            if(a==A[i]){
                System.out.println("a nằm ở vị trí " +i+ " trong mảng");
                break;
            }
            
            }
        }
    }
    

