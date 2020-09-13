package mangbai2;

import java.util.Scanner;
public class MangBai2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mang = new int[5];
        for( int i=0; i<mang.length;i++){
            System.out.println("vui long nhap phan tu thu "+(i+1));
            mang[i]=input.nextInt();
            }
        
        System.out.println("Cac phan tu vua nhap vao:");
        for(int x: mang){
            System.out.println(x);
        }
        //tim phan tu lon nhat trong mang
        int max=0;
        int min=100;
        for( int i=0; i<mang.length;i++){
            if(mang[i]>=max){
                max=mang[i];
            }
            if(mang[i]<=min){
                min=mang[i];
            }
        }
        
        System.out.println("Max="+max);
        System.out.println("Min ="+min);
        //tim phan tu chia het cho 3
        System.out.println("Cac phan tu chia het cho 3 la: ");
        for (int i = 0; i < mang.length; i++) {
            if(mang[i]%3==0){
                System.out.println(mang[i]);
            }
            
        }
             
         
    
    }
}
