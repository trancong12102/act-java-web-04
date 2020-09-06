/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitap11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vieth
 */
public class CustomerManager {

    private List<Customer> list = new ArrayList<>();
    public final static File file = new File("cust.dat");

    public void loadFile() {
        try {
            
            
            
            if (!file.exists()) {
                boolean correct = file.createNewFile();
                System.out.println("Created file:");
                System.out.println("Null file");
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream fos = new ObjectInputStream(fis);
            if (fis.available() > 0) {
                while (fis.available() > 0) {

                    Customer cus = (Customer) fos.readObject();
                    System.out.println(cus.toString());

                }

            }
            fis.close();
            fos.close();

        } catch (Exception ex) {
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        String string;
        
            while (true) {
                Customer cus = new Customer();
                System.out.println("Input id:");
                cus.setId(sc.nextInt());
                System.out.println("Input name:");
                sc.nextLine();
                cus.setName(sc.nextLine());
                System.out.println("Input address:");
                cus.setAddress(sc.nextLine());
                System.out.println("Input age:");
                cus.setAge(sc.nextInt());
                this.list.add(cus);
                sc.nextLine();
                System.out.println("Do you want input info:yes/no:");
                string = sc.nextLine();
                if (string.equalsIgnoreCase("no")) {
                    break;
                }
            }
            
           

    }

    public void search() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Input id search:");
        number = sc.nextInt();
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream fos = new ObjectInputStream(fis);
            while (fis.available()>0) {
                Customer cus =(Customer) fos.readObject();
                if(cus.getId()==number) {
                    System.out.println(cus.getId()+"|"+cus.toString());
                }
            }
        } catch (Exception e) {
        }
    }
    public void save() {
         Scanner sc = new Scanner(System.in);
        boolean key = true;
        try {
            FileOutputStream fis = new FileOutputStream(file);
            ObjectOutputStream fos = new ObjectOutputStream(fis);
            Customer cus = new Customer();
            for (Customer customer : this.list) {
                fos.writeObject(customer);
            }
            fis.close();
            fos.close();
        } catch (Exception ex) {

        }
    }
    public void output() {
        for (Customer customer : this.list) {
            System.out.println(customer.getId());
        }
    }
}
