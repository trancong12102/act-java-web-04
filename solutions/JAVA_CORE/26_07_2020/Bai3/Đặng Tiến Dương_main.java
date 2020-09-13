/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Admin
 */
public class Main3 {
    public static void main(String[] args) {
        
    HocBong student1= new HocBong();
        student1.inputInfo();
        if (student1.kt()) {
            System.out.println("Bạn được học bổng");
        }
        else {
            System.out.println("Bạn không được học bổng");
        }
    }
   
}
    
    
    

