/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Mainclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Nhanvien NV= new Nhanvien();
        NV.inputInfo();
        NV.printInfo();
    }
    
}
