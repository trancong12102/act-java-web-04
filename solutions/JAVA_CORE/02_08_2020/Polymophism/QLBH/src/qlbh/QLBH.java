/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlbh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLBH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Store s = new Store();
        int cc = 0;
        Scanner sc = new Scanner(System.in);
        do {            
            System.out.println("MENU");
            System.out.println("1. add");
            System.out.println("2. list");
            System.out.println("3. Sắp xếp tăng dần theo giá");
            System.out.println("4. Sắp xếp giảm dần theo giá");
            System.out.println("5. thoat");
            System.out.println("Chon > ");
            int chon = Integer.parseInt(sc.nextLine());
            switch(chon){
                case 1:
                    s.addProduct();
                    break;
                case 2:
                    s.listProduct();
                    break;
                case 3:
                    s.SapXepTD();
                    s.listProduct();
                    break;
                case 4:
                    s.SapXepGD();
                    s.listProduct();
                    break;
                case 5:
                    System.exit(chon);
                default:
                    break;
            }
        } while (cc != 6);
    }
}
