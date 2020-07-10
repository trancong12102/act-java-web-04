/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTapJava2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai10 {
    public static void main(String[] args) {
       int n, kt = 1;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n <= 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập giá trị cho các phần tử của mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("A[" + i + "] = ");
        A[i] = scanner.nextInt();
    }
         
    // kiểm tra mảng đảo ngược
    // dùng vòng lặp for duyệt i = 0 đến i < n / 2
    // nếu A[i] != A[n - i -1]
    // thì mảng đó không phải mảng đối xứng
    for (int i = 0; i < n / 2; i++) {
        if (A[i] != A[n - i - 1]) {
            kt = 0;
            break;
        }
    }
         
    if (kt == 0) {
        System.out.println("Mảng một chiều vừa nhập không là mảng đối xứng");
    } else {
        System.out.println("Mảng một chiều vừa nhập là mảng đối xứng");
    }   
    }
     
}

