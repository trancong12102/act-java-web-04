
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
public class bai3array1 {

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
        // Kiem tra xem so co trong mang khong 
        System.out.println("Xin moi nhap a:");
        int a;
        a = Integer.parseInt(input.nextLine().trim());
        for (int i = 0; i < Array.length; i++) {
            if (a == Array[i]) {
                System.out.println("So a co trong mang va o vi tri " + i);
            }
        }
    }

}
