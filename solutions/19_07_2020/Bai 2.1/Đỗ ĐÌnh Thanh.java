package demo;
import java.util.Scanner;
public class Demo {
   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Bai 1 : Tổng  mỗi hàng-cột ma trận 3x3:");
        System.out. println("Nhập ma trận 3x3: ");
        int[][]  a = new   int[3][3];
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhâp:");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf(" %d ", a[i][j]);
            }
            System.out.println();
        } 
         System.out.println("\nTổng mỗi hàng lần lượt là:");
        for(int i=0; i<3; i++ ){
            int tong_hang =0;
            for(int j=0; j<3 ;j++ ){
                tong_hang += a[i][j];
            }
            System.out.printf(" %d ", tong_hang);
        } 
        System.out.println("\nTổng mỗi cột lần lượt là:");
        for(int i=0; i<3; i++ ){
            int tong_cot =0;
            for(int j=0; j<3 ;j++ ){
                tong_cot += a[j][i];
            }
            System.out.printf(" %d ", tong_cot);
        }
        
         }
   }
    

