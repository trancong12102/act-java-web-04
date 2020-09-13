/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsv;

/**
 *
 * @author Admin
 */
public class QLSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st = new Student();
        st.inputInfo();
        System.out.println("Ma SV\tDTB\tTuoi\tLop");
        st.showInfo();
        st.HBong();
    }
    
}
