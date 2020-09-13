package mang1chieu;
import java.util.Scanner;
/**
 *
 * @author Trieu
 */
public class Mang1chieu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mang = new int[5];
        int sum=0;
        for( int i=0; i<mang.length;i++){
            System.out.println("vui long nhap phan tu thu "+(i+1));
            mang[i]=input.nextInt();
            }
        for(int x: mang){
            System.out.println("Cac phan tu vua nhap vao:");
            System.out.println(x);
        }
        
        //tinh tong cac phan tu trong mang
        for( int i=0; i<mang.length;i++){
             sum+=mang[i];
        }
        System.out.println("Tong cua mang ="+sum);
    
        
        
        //tinh tong phan tu chan hoac phan tu le trong mang
        int tongchan=0;
        int tongle=0;
        for( int i=0; i<mang.length;i++){
            if(mang[i]%2==0){
                tongchan+=mang[i];
            }
            if(mang[i]%2!=0){
                tongle +=mang[i];
            }
            
        }
        System.out.println("Tong cac phan tu chan trong mang la :"+tongchan);
        System.out.println("Tong cac phan tu le trong mang la :"+tongle);
        
        //
        
    }
    
}
