/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai.pkg4;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class bai4b { 
    public static void main(String[] args) {
        int a;
        int min;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao cac cac so:");
        a = Integer.parseInt(input.nextLine().trim());
        min = a;
        while (a != 0) {

            a = Integer.parseInt(input.nextLine().trim());
            if (a < min) {
                min = a;
            }
        }
        System.out.println("So be nhat la: " + min);
    }
    
}
