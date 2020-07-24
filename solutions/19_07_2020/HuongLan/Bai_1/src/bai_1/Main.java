/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[] = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
        int sum = 0, sumle = 0;
        for (int i = 0; i < 5; i++) {
            sum += a[i];
            if (a[i] % 2 != 0) {
                sumle += a[i];
            }
        }
        System.out.println("Tong phan tu cua mang la "+sum);
        System.err.println("Tong phan tu le cua mang la "+ sumle);
        System.err.println("Tong phan tu chan cua mang la "+(sum-sumle));
    }

}
