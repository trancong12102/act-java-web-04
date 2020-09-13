
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */
public class bai3 {
    public static void main(String[] args) {
        int[] so = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap so thu %d: ", i+1);
            so[i]  = Integer.parseInt(input.nextLine());
        }
        System.out.println("Nhap vao so nguyen: ");
        int a = Integer.parseInt(input.nextLine()), check=0;
        for (int pt: so){
            if(a==pt){
                check++;
            }
        }
        if(check>0){
            System.out.println("So nguyen do co ton tai trong mang");
            System.out.print("Vi tri cua so do la thu:");
            for (int i=0; i<5;i++){
                if(a==so[i]){
                    System.out.print(" "+i);
                }
            }
            System.out.println(" trong mang");
        }
        else
            System.out.println("So nguyen do khong ton tai trong mang");
        
        
    }
}
