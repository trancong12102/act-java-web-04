package demo;
import java.util.Scanner;
public class bai5 {
    public static void main(String[] args)
    {
        Scanner nhap = new Scanner(System.in);
         System.out.println("Bài 5: TÍnh tổng, tích vô hướng 2 vector 3 chiều ");
         int[] A= new int [3];
         int[] B= new int [3];
         int[] C= new int [3];
         int tich_vo_huong = 0;
         System.out.println("Nhap vertor A: ");
         for(int i=0 ; i<A.length ;i++){
             A[i] = nhap.nextInt();
         }
         System.out.println("Nhap vertor B: ");
         for(int i=0 ; i<B.length ;i++){
             B[i] = nhap.nextInt();
         }
         System.out.println("TỔng 2 vertor là vector có tọa độ:");
         for(int i=0 ; i<C.length ;i++){
             C[i]= A[i] +B[i];
             System.out.printf(" %d ", C[i]);
         }
         for(int i=0 ; i<3 ;i++){
             int a= A[i]*B[i];
             tich_vo_huong += a;
         }
          System.out.println("\nTích vô hướng 2 vector là "+ tich_vo_huong);
    }
}
