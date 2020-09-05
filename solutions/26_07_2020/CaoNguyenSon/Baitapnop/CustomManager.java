/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baitapnop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CustomManager {

    private static String PATH = "C:\\Users\\Admin\\Desktop\\Du lieu.txt";
    ArrayList<Customer> list = new ArrayList<>();

    boolean save() {
        try {
            System.out.println("Writing on File!!!");
            FileOutputStream fos = new FileOutputStream(PATH);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.flush();
            oos.close();
            System.out.println("Writing Complete!!!");
        } catch (Exception ex) {
            System.out.println("Writing Error!!!");
            System.out.println(ex);
        }
        return true;
    }

    void add(Customer customer) {
        list.add(customer);
    }

    void Search() {
        Scanner input = new Scanner(System.in);
        System.out.println("Searching Function!!!");
        System.out.println("Object id> ");
        int k = Integer.parseInt(input.nextLine());
        System.out.println("Ket qua tu mang voi object id: " + k);
        if (list.get(k) == null) {
            System.out.println("Khong tim thay object trong mang!!!");
        } else {
            System.out.println(list.get(k-1));
        }
    }

    boolean load() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Reading your File!!!");
            ArrayList<Customer> obj = null;
            FileInputStream fis = new FileInputStream(PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (ArrayList<Customer>) ois.readObject();
            ois.close();
            list = obj;
            System.out.println("Ket qua doc!!!");
            for (Customer i : list) {
                System.out.println(i);
            }
            System.out.println("Ban co muon tim kiem trong file? 0/1");
            int c,i;
            c = input.nextInt();
            if(c == 1){
                try{
                    System.out.println("Nhap vao id: ");
                    i = input.nextInt();
                    System.out.println("Ket qua tu file voi object id = " + i);
                    System.out.println(list.get(i-1));
                }catch(Exception e){
                    System.out.println("Khong tim thay! Hay kiem tra lai!");
                }
            }else if(c==0){
                System.out.println("Thoat chuong trinh!!!");
            }
        } catch (Exception ex) {
            System.out.println("Reading Error!!!");
            System.out.println(ex);
        }
        return true;
    }
}
