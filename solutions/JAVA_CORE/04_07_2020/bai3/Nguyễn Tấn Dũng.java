/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----------------------Bai 3--------------------------");
        System.out.println("1.Viet chuong trinh kiem tra so n co phai so nguyen to");
        System.out.println("2.Viet chuong trinh in ra n so nguyen to dau tien . Voi n nhap vao tu ban phim");
        System.out.println("Moi ban cho bai tap so:");
        int num = input.nextInt();
        switch(num)
        {
            case 1:
            {
                System.out.println("1. Viet chuong trinh kiem tra so n co phai so nguyen to");
                System.out.println("Moi ban nhap so n:");
                int n = input.nextInt();
                int dem =0;
                for(int i=1;i<=n;i++)
                {
                    if(n%i==0)
                    {
                        dem++;
                    }
                }
                if(dem==2)
                {
                    System.out.printf("So %d la so nguyen to",n);
                }
                else
                {
                    System.out.printf("So %d khong phai la so nguyen to",n);
                }
                break;
        }
            case 2:
            {
                System.out.println("2.Viet chuong trinh in ra n so nguyen to dau tien . Voi n nhap vao tu ban phim");
                System.out.println("So nguyen to ma ban can in ra man hinh la :");
                int soluong = 1;
                int so=2;
                System.out.println("Nhap so n= ");
                Scanner sc= new Scanner(System.in);
                int n= sc.nextInt();
                while(soluong<=n)
                {
                int dem =0;
                for(int i=1; i<=so; i++)
                {
                if(so%i==0)
                    {
                        dem ++;
                    }
                }
            if(dem==2)
            {
                System.out.println(""+so);
                soluong++;  
            }
            so++;
            }   
    }
    }
    
}
