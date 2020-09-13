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
public class ExercisesLesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = sc.nextInt();
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int[] intArr = new int[n];
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("Nhap phan tu A[%d]: ", i + 1);
            intArr[i] = sc.nextInt();
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.printf("%d\t", intArr[i]);
            sum += intArr[i];//tong chuoi
            if (intArr[i] % 2 != 0) {
                sum1 += intArr[i];//tong so le
            } else {
                sum2 += intArr[i];//tong so chan
            }
        }
        System.out.println("");
        System.out.println("Tong chuoi la : " + sum);
        System.out.println("Tong cac so le la: " + sum1);
        System.out.println("Tong cac so chan la: " + sum2);
    }
}
