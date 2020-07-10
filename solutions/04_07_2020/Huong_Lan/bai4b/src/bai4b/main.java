/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4b;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap day so:");
        int n = input.nextInt();
        int min = n;
        while (n != 0) {
              n = input.nextInt();
            if (n < min) {
                min = n;
            }
          
        }
        System.out.println("So nho nhat vua nhap la: " + min);
    }
}
