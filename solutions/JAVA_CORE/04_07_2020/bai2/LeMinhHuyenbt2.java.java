/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhgiaithua;

import java.util.Scanner;

public class Tinhgiaithua {

    /**
     * @param args the command line arguments
     */
//    int giaithua =1
    public static void main(String[] args) {
        int giaithua = 1;
        System.out.println("Nhap n");
        int n;

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 1; i <= n; i++) {
            giaithua = giaithua * i;

        }
        System.out.println("giai thua = " + giaithua);

    }

}
