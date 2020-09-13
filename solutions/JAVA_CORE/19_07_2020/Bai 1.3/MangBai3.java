package mangbai3;

import java.util.Scanner;
public class MangBai3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[] mang = new int[5];
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhap phan tu thu "+(i+1)+" :");
            mang[i]= input.nextInt();
        }
        System.out.println("Mang vua nhap la :");
        for (int x : mang) {
            System.out.println(x);
            
        }
        System.out.println("Nhap phan tu a bat ki :");
        int a = input.nextInt();
        for (int i = 0; i < mang.length; i++) {
            if(mang[i]==a){
                System.out.printf("so nguyen %d dung o vi tri %d trong mang\n",a,i+1);
            }else if(mang[i]==a){
                System.out.printf("so nguyen %d dung o vi tri %d trong mang\n",a,i+1);
            }
            else{
                System.out.printf("Khong co phan tu %d trong mang\n",a);
                break;
            }
        }
    }
    
}
