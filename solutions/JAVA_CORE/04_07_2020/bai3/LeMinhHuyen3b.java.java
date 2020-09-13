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
public class inransonguyento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n");
        int n;
        n = Integer.parseInt(sc.nextLine().trim());
        int dem = 1;
        int so = 2;
        while (dem <= n) {
            int count = 0;
            for (int i = 1; i <= so; i++) {
                if (so % i == 0) {
                    count++;
                }

            }
            if (count == 2) {
                System.out.println("" + so);
                dem++;
            }
            so++;
        }

    }
}
