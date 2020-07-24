
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
public class bai1a {

    public static void main(String[] args) {
        int[] Array = new int[5];
        // Nhap gia tri vao mang 
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < Array.length; i++) {
            System.out.println("Nhap gia tri vao mang:");
            Array[i] = Integer.parseInt(input.nextLine().trim());

        }
        // In mang ra 
        for (int i = 0; i < Array.length; i++) {
            System.out.print("          " + Array[i]);
        }
        System.out.println("");
        int Total = 0;
        // Tinh tong cac phan tu trong mang 
        for (int i = 0; i < Array.length; i++) {
            Total += Array[i];

        }
        System.out.println("Tong cua mang la " + Total);
    }

}
