/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap11;

import java.util.Scanner;

/**
 *
 * @author vieth
 */
public class Main {
    public static void main(String[] args) {
    CustomerManager cum= new CustomerManager();
    Scanner sc = new Scanner(System.in);
    int key;
    
    while(true) {
        menu();
        key=sc.nextInt();
        switch(key) {
            case 1:
                cum.loadFile();
                break;
            case 2:
                cum.add();
                break;
            case 3:
                cum.output();
                cum.search();
                break;
            case 4:
                cum.save();
                break;
            case 5:
                System.out.println("Exit...");
                System.exit(0);
            default:
                System.out.println("Error");
                
        }
        sc.nextLine();
    }
    }
    public static void menu() {
        System.out.println("=====MENU=====");
        System.out.println("1. Load data");
        System.out.println("2. Add new");
        System.out.println("3. Search");
        System.out.println("4. Save");
        System.out.println("5. Exit");
    }
    
}
