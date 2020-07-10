package trieubai3a;

import java.util.Scanner;
public class TrieuBai3a {

    /**
     * kiem tra n co phai la so nguyen to hay khong
     */
    public static void main(String[] args) {
        System.out.println("-----BAI 3.a-----");
        System.out.println("Xin moi nhap n :");
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();
           int dem=0;
            if(n<2){
                  System.out.printf("%d khong phai la so nguyen to\n",n);
              }
            else{
                for(int i=2 ; i<Math.sqrt(n);i++){
                  if(n%i==0){
                      dem++;
                  }
                }
                if(dem==0){
                    System.out.printf("%d la so nguyen to \n",n);
                }
                else{
                    System.out.printf("%d khong la so nguyen to \n",n );
                }
                 
            }
    }
}
