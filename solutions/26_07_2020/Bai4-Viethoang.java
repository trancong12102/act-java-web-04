/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SoNguyenTo soNguyenTo= new SoNguyenTo();
        soNguyenTo.setA(sc.nextInt());
        System.out.println(soNguyenTo.timSoNguyenToTiepTheo());
    }
}