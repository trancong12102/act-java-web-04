
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author green
 */
public class b4hai {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap so ban muon");
        int b = sc.nextInt();
        while (b!=0) {
            System.out.println("Hay nhap so ban muon");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            } else if (b > a) {
                b = a;
            }
        }
        if(b==0)
        {
            System.out.println("Khong tim duoc so nao phu hop voi de bai do so khoi tao bang 0");
        }
        else
        {
             System.out.println("So nho nhat trong cac so vua nhap la: " + b);
        }
       
    }
    
}
