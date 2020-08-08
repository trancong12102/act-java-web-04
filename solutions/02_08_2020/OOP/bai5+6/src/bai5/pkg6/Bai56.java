/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5.pkg6;

/**
 *
 * @author Admin
 */
public class Bai56 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r = new Rectangle();
        r.InputInfo();
        System.out.println("S = " +r.Acreage());
        System.out.println("P = " +r.Perimeter());
        Triangle triangle = new Triangle();
        System.out.println("Nhap 3 canh cua tam giac");
        triangle.InputInfo();
        System.out.println("S = " +triangle.Acreage());
        System.out.println("P = " +triangle.Perimeter());
        
    }
    
}
