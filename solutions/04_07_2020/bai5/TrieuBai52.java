package trieubai52;

import java.util.Scanner;


public class TrieuBai52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Xin moi nhap n:");
        Scanner input= new Scanner(System.in);
        int n= input.nextInt();
        float S=0;
        if(n<0){
            System.out.println("Xin moi thuc hien lai :");
        }
        else{
        for(int i=0; i<=n; i++){
            S+=i;
        }
        System.out.println("Tong S(n)= "+S);
        }
    }
    
}
