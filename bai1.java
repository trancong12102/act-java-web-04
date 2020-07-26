
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
public class bai1 {
    public static void main(String[] args) {
        int[] so = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Nhap so thu %d: ", i+1);
            so[i]  = Integer.parseInt(input.nextLine());
        }
        int tong = 0; int tongChan=0; int tongLe=0;
        for (int pt: so){
            tong = tong + pt;
            if(pt%2==0){
                tongChan=tongChan+pt;
            }
            if(pt%2==1){
                tongLe=tongLe+pt;
            }
        }
        System.out.println("Tong cac phan tu la: "+tong);
        System.out.println("Tong cac phan tu chan la: "+tongChan);
        System.out.println("Tong cac phan tu le la: "+tongLe);
    }
}
