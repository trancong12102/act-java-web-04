
package demo;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args){
      
        Scanner nhap = new Scanner(System.in);
        System.out.println("Bai 3: Kiểm tra ma trận: đơn-vị 0 đối xứng ");
        int[][]  a = new   int[3][3];
         System.out. println("Nhập ma trận (3x3): ");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf("a[%d][%d] = ",i,j);
                a[i][j] = nhap.nextInt();
            }
        }
        System.out.println("Ma trận vừa nhâp:");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                System.out.printf(" %d ", a[i][j]);
            }
            System.out.println();
        } 
        int b=0,c=0,d=0;
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3 ;j++ ){
                 if( (a[i][i]!=1)  || (i!=j)&&(a[i][j]!=0) )
                       b++;
                 
                 if(a[i][j] ==0)
                     c++;
                 if(a[i][j] != a[j][i]  )
                     d++;
            }
        } 
      if(b==0)
            System.out.println("là ma trận đơn vị");
      if(c==9)
            System.out.println("là ma trận không");
      if(d==0)
            System.out.println("là ma trận đối xứng");
    
    }
}
