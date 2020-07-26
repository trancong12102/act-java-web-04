
import java.util.Scanner;
import sun.security.util.Length;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class bai2 {
    public static void main(String[] args) {
        int[] so = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap so thu %d: ", i+1);
            so[i]  = Integer.parseInt(input.nextLine());
        }
        int tong = 0; int tongChan=0; int tongLe=0;
        int max=so[0]; int min= so[0];
        for (int i = 1; i < 4; i++) {
                 if(so[i]>max){
                     max=so[i];
                 }
                 if(so[i]<min){
                     min=so[i];
                 }
        }
        System.out.println("so lon nhat la: "+max);
        System.out.println("so nho nhat la: "+min);
        System.out.print("so chia het cho 3:");
        for (int i = 0; i < 5; i++) {
            if(so[i]%3==0)
                System.out.print(" "+so[i]);
        }
        System.out.println("");
    }
}
