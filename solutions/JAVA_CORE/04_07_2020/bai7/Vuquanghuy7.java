/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Bai7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Day Fibonaci
        Scanner input = new Scanner(System.in);
        int n;
        float f0 = 1;
        float f1 = 1;
        float fn = 1;
        System.out.println("Nhap vao n: ");
        n = input.nextInt();
        if (n < 0) {
            System.out.println("Nhap lai voi n>=0");
        } else {
            for (int i = 2; i <= n; i++) {
                fn = f0 + f1;
                f0 = f1;
                f1 = fn;
            }
            System.out.printf("So Fibonaci thu %d la %f", n, fn);
        }
        // TODO code application logic here
    }
    
}
