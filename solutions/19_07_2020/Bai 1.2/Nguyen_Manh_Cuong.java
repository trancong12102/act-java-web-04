/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.lesson.pkg4;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class ex2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu ban muon nhap: ");
        int n = sc.nextInt();
        int[] intArr = new int[n];
        int max = 0;
        int min = 0;
        for (int i = 0; i < intArr.length; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            intArr[i] = sc.nextInt();
            max = intArr[0];
            min = max;
            //tim so lon nhat
            if (max < intArr[i]) {
                max = intArr[i];
            } 
            //tim so nho nhat
            else if (min > intArr[i]) {
                min = intArr[i];
            }
        }
        //tim so chia het cho 3
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 3 == 0) {
                System.out.printf("So chia het cho 3 la: %d\t", intArr[i]);
            }
        }
        System.out.println("");
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.println("Gia tri nho nhat la: " + min);
    }
}
