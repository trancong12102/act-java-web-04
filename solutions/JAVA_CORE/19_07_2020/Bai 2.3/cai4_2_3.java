/*
3. Nhập vào Ma trận 3x3. Kiểm tra xem  
a. Ma trận vừa nhập có phải là ma trận đơn vị hay không. 
b. Ma trận vừa nhập có phải là ma trận 0 hay không. 
c. Ma trận vừa nhập có phải là ma trận đỗi xứng hay không.
 */
package bai4;

import java.util.Scanner;

public class cai4_2_3 {
    public static int Nhapmt(){ //Ham nhap ma tran A
        Scanner input = new Scanner(System.in);
        int [][] A = new int[3][3];
        System.out.println("Nhap ma tran A ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.printf("Nhap A[%d][%d]= ",i,j);
                A[i][j] = input.nextInt();
                System.out.printf("%d  ",A[i][j]);//In ra ma tran A
            }
            System.out.println("\n");
        }
        return 0;
        }
        public static int Kiemtradv(){
            int [][] A = new int[3][3];
            for(int i=0; i<3; i++)
            {
                if(A[i][i] !=1)
                {
                    return 0;
                }
            }
            for(int i=0; i<3; i++)
            {
                for(int j=i+1; j<3; j++)
                {
                    if((A[i][j] !=0) || (A[j][i] !=0))
                    {
                     return 0;
                    }
                }
            }
            return 1;
    }
        public static void main(String[] args) {
            Nhapmt();
         if(Kiemtradv()==0)
            {
                System.out.println("mt vua nhap khong phai la ma tran don vi");
            }
            if(Kiemtradv()==1)
            {
                System.out.println("mt vua nhap la ma tran don vi");
            }
    }
}
