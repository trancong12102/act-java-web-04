
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DaiPhongPC
 */
public class bai4a {

    public static void main(String[] args) {
        Random rd = new Random();
        // Nhap mang 
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        // In mang ra 
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t", arr[i]);
        }
        // Sap xep mang theo thu tu tang dan 
        System.out.println("");
        System.out.println("Dãy số sắp xếp theo thứ tự tăng dần:");
        int temp;
        temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
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