/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        st.inputInfo();
        st.testHocBong();
    }
}
