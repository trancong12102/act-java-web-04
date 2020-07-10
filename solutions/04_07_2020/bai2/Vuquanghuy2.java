/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int n, temp = 1;
        long giaiThua = 1;
        Scanner scanner = new Scanner(System.in);
         
        System.out.println("Nhập vào số n: ");
        n = scanner.nextInt();
         
        while ((n <= 0) || (n > 10)) {
            System.out.println("Nhập lại số n");
            n = scanner.nextInt();
        }
         
        /*
         * Nếu giá trị biến temp còn nhỏ hơn hoặc bằng n 
         * thì còn thực hiện đoạn lệnh bên trong while
         */
        while (temp <= n) {
            giaiThua *= temp;
            temp++;
        }
         
        System.out.println(n + "! = " + giaiThua);
        // TODO code application logic here
    }
    
}
