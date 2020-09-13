/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.pkg41;

import java.util.Scanner;

/**
 *
 * @author iTplusHN
 */
public class Main41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        Tamgiac TG = new Tamgiac();
        TG.inputInfo();
        TG.isTamgiac();
        TG.Chuvi();
        TG.Dientich();
        
    }
    
}
