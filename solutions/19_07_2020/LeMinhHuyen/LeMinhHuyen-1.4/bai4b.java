
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DaiPhongPC
 */
public class bai4b {

    public static void main(String[] args) {

        // Nhập số phần tử của mảng
        System.out.println("Nhập số phần tử của mảng: ");
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());

        // Random các thành phần trong mảng 
        Random rd = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        // In ra mảng 
        for (int i = 0; i < arr.length; i++) {
            System.out.print("  " + arr[i]);
        }
        // Sap xep mang theo thu tu giam dan 
        System.out.println("");
        System.out.println("Dãy số sắp xếp theo thứ tự giảm dần:");
        int temp;
        temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // In ra mang da sap xep 
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
