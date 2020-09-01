/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author topmu
 */
public class simple {
    public  void creationFile(final File f)
    {
        if (f.exists())
        {
            System.out.print("file da ton tai");
        } 
        else 
        {
            try {
                f.createNewFile();
                System.out.println("da tao thanh cong");
            } catch (IOException ex) {
                Logger.getLogger(simple.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
    public  void soanthao()
    {
        System.out.println("Chào Mừng bạn đến với phần mềm soạn thảo");
        try 
        {
            PrintWriter fos = new PrintWriter(new FileOutputStream("D:\\Hai2.txt"));
            do 
            { 
                
                String nhap = new Scanner(System.in).nextLine();
                fos.write(nhap);
                if(":q".equalsIgnoreCase(nhap))
                {
                    return;
                }
                if(":wq".equalsIgnoreCase(nhap))
                {
                    fos.close();
                    return;
                }            
            } while (true);
        }
        catch (FileNotFoundException e) {
            System.out.println("co loi");
        }
    }
    public void outdoc(final File f) throws IOException
    {
    
        try 
        {
            FileInputStream fis = new FileInputStream(f);
            int size = fis.available();
            for (int i = 0; i < size; i++) {
            System.out.print((char) fis.read());
            }
        fis.close();
        }
        catch (FileNotFoundException e) 
        {
            System.out.println("co loi xay ra");
        }
    }
        
    
}
