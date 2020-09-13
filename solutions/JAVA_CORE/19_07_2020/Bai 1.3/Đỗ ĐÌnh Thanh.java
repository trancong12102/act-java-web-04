
package demo;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
      
        Scanner nhap = new Scanner(System.in);
        System.out.println("Bai 3: mang + vi tri xuat hien A ");
        System.out.println("Nhap mang: ");
        int[] array = new int [5];
         for(int i=0; i<array.length ; i++){
             System.out.printf("a[%d] = ",i);
             array[i] = nhap.nextInt();
        }
         System.out.print("Nhap A: ");
         int a= nhap.nextInt();
         System.out.print("Vi tri xuat hien A la: ");
         for(int i=0;i<array.length;i++){
             if(array[i]== a)
                 System.out.print(i);
         }
          
    }
}
