/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5_7;

import java.util.Scanner;

/**
 *
 * @author nghia
 */
public class bai2 {
    public static void main(String[] args) {
        int number, temp = 1;
        long giaiThua = 1;
         
        Scanner scanner = new Scanner(System.in);
         
        do {
            System.out.println("Nhập vào 1 số bất kỳ: ");
            number = scanner.nextInt();
        } while ((number <= 0) || (number > 10));
         
        /*
         * Nếu giá trị biến temp còn nhỏ hơn hoặc bằng number
         * thì còn thực hiện đoạn lệnh bên trong while
         */
        while (temp <= number) {
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(number + "! = " + giaiThua);
    }
}
