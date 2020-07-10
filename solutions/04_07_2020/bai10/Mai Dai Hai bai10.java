/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b10_6;

import java.util.Scanner;

/**
 *
 * @author topmu
 */
public class bai10 {
    public static void main(String[] args) {
        System.out.printf("nhập số n cần kiểm tra đối xứng:");
        Scanner input = new Scanner(System.in);
        String n = input.next();
        String N = new StringBuffer(n). reverse().toString();
        int k = Integer.parseInt(n);
        int i = Integer.parseInt(N);
        if (k==i){
            System.out.println(n+" là số đối xứng");   
        }
        else System.out.println(n+" k phải số đối xứng");
        
             
    }
}
