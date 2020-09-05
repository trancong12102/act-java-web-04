/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitapnop;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        int luachon;
        Customer customer = new Customer();
        CustomManager cmanager = new CustomManager();
        do {
            System.out.println("=====MENU=====\n" + "\n1. Load Data\n"
                    + "\n2. Add new\n" + "\n3. Search\n" + "\n4. Save\n" + "\n5. Exit\n");
            System.out.println("Your Choose: ");
            Scanner input = new Scanner(System.in);
            luachon = Integer.parseInt(input.nextLine());
            if (luachon == 1) {
                cmanager.load();
            } else if (luachon == 2) {
                boolean c = false;
                do {

                    try {
                        System.out.println("Nhap vao thong tin!!!");
                        System.out.println("Id > ");
                        customer.setId(Integer.parseInt(input.nextLine()));
                        System.out.println("Name > ");
                        customer.setName(input.nextLine());
                        System.out.println("Address > ");
                        customer.setAddress(input.nextLine());
                        System.out.println("Age > ");
                        customer.setAge(Integer.parseInt(input.nextLine()));
                        cmanager.add(customer);
                        c = true;
                    } catch (Exception e) {
                        System.out.println("Gap loi, mai ban nhap lai!!!");
                        System.out.println(e);
                    }
                } while (c != true);

            } else if (luachon == 3) {
                cmanager.Search();
            } else if (luachon == 4) {
                cmanager.save();
            }
        } while (luachon != 5);

    }
}
