package demo;
import java.util.Scanner;
public class bai2 {
    
    public static void main(String[] args){
         Scanner nhap = new Scanner(System.in);
         System.out.println("Bài 2: Tổng tích 2 ma trận 3x3: + định thức ma trận");
         int[][]  a = new   int[3][3];
         int[][]  b = new   int[3][3];
         System.out. println("Nhập ma trận A (3x3): ");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = nhap.nextInt();
            }
        }
        
          System.out. println("Nhập ma trận B (3x3): ");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf("b[%d][%d] = ",i,j);
                b[i][j] = nhap.nextInt();
            }
        }
        
        System.out.println("Ma trận Tổng của 2 ma trận A,B:");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                 int c= (a[i][j]+b[i][j]);
                System.out.printf(" %2d ", c);
            }
            System.out.println();
        } 
        System.out.println("Ma trận Tích của 2 ma trận A,B:");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                 int c=0;
                 for(int k=0;k<3;k++)
                 {
                     c += (a[i][k]*b[k][j]);
                 }
                         
                System.out.printf(" %2d ", c);
            }
            System.out.println();
        }
        System.out.println("\nĐịnh thức ma trận A:");
        int c= a[0][0] * a[1][1] * a[2][2] ;
        int d= a[0][1] * a[1][2] * a[2][0] ;
        int e= a[0][2] * a[1][0] * a[2][1] ;
        
        int f= a[0][2] * a[1][1] * a[2][0] ;
        int g= a[0][1] * a[1][0] * a[2][2] ;
        int h= a[0][0] * a[1][2] * a[2][1] ;
        int det =c+d+e -f-g-h;
        System.out.printf(" %d \n",det );
    }
}