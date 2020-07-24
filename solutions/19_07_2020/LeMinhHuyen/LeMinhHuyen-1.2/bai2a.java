
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
public class bai2a {
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
        //Tim ra phan tu lon nhat trong mang 
        int maximum = Array[0]; 
        for (int i = 0; i < Array.length; i++){
            if (maximum < Array[i]){
                maximum = Array[i]; 
               
            }
        }
        System.out.println("Maximum = " + maximum);
    }
}
