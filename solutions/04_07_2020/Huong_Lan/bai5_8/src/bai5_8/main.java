/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_8;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = input.nextInt();
        float s = 1;
        for (int i = 2; i <= n; i++) {
            s = s + s*i;
        }
        System.out.println("Tong s = " + s);
    }
    
}
