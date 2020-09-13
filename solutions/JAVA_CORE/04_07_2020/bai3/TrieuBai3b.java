package trieubai3b;
import java.util.Scanner;
public class TrieuBai3b {

    /**
     * in ra n chư so nguyen to dau tien, vơi n nhap vao tu ban phim
     */
    public static void main(String[] args) {
        System.out.println("-----Bai3.b----");
        System.out.println("Vui long nhap gia tri n :");
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int dem=1;
        int num =3;
        if(n<2){
            System.out.println("n khong thoa man vui long nhap lai");
        }
        else{
            System.out.println(n+" so nguyen to dau tien la :");
            System.out.println(2);
            for(int i=2; i<=n;){
                for(int j=2; j<=Math.sqrt(num);j++){
                    if(num%j==0){
                        dem=0;
                        break;
                    }
                }
                if(dem!=0){
                    System.out.println(num);
                    i++;
                }
                dem=1;
                num++;
            }
        }
    }
}