/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songuyento;

import java.util.Scanner;

/**
 *
 * @author DaiPhongPC
 */
public class Songuyento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so nguyen to n");
        n = Integer.parseInt(sc.nextLine().trim());
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println(n + " la so nguyen to");
        }
        else 
            System.out.println(n + " khong la so nguyen to");
    }

}
