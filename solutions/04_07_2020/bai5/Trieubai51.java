package trieubai51;

import java.util.Scanner;
public class Trieubai51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Xin moi nhap n:");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        float S=1;
        if(n<1){
            System.out.println("Xin moi thuc hien lai :");
        }
        else if(n==1){
            System.out.println("Tong ="+S);
        }else{
        for(int i=2; i<=n; i++){
            S+=(1/(float)i);
        }
        System.out.println("Tong = "+S);
        }
    }
    
}
