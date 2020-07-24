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
public class ex5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] sumArr = new int[3];
        int times = 0;
        System.out.println("Hay nhap vector dau tien");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("A[%d]= ", i + 1);
            arr1[i] = sc.nextInt();
        }
        System.out.println("Hay nhap vector tiep theo");
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("B[%d]= ", i + 1);
            arr2[i] = sc.nextInt();
        }
        System.out.println("Tong 2 vetor la 1 vector moi co toa do:");
        for (int i = 0; i < arr1.length; i++) {
            sumArr[i] = arr1[i] + arr2[i];
            System.out.printf("%d ", sumArr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            times += arr1[i] * arr2[i];
        }
        System.out.println("Tich vo huong cua hai vector la: " + times);
    }
}
