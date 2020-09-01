/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1file;


import java.io.File;
import java.text.SimpleDateFormat;


public class FileUtils {
    

    public FileUtils() {
    }
    public void outfoder(final File f)
    {  
        if(f.isDirectory())
        {
            File [] children = f.listFiles();
            try 
            {
                for (File children1 : children) {
                    if (children1.isDirectory()) {
                        System.out.println(children1.getAbsolutePath());
                    }
                }
            }    
            catch( AbstractMethodError exception)
            {
                System.out.println("chua chay vong for ");
            }    
                    
        }
        System.out.println("=======================================");
    }        
    public void outfile(final File f)
    {
        
        System.out.println("Các file trong "+f.getAbsolutePath());
        if(f.isDirectory())
        {
            File[] chilren =f.listFiles();
            for(File chil : chilren)
            {
                if(chil.isFile())
                {
                    System.out.println(chil.getAbsolutePath());
                }
            }
        }
        System.out.println("=======================================");
    }
    public void outpng(final File f)
    {
        System.out.println("Các file Ảnh "+f.getAbsolutePath());
        if(f.isDirectory())
        {
            File[] chilren =f.listFiles();
            for(File chil : chilren)
            {
                if(chil.getAbsolutePath().endsWith(".png")||
                   chil.getAbsolutePath().endsWith(".jpg")||
                   chil.getAbsolutePath().endsWith(".jpeg"))
                {
                   System.out.println(chil.getAbsolutePath());
                }
            }
        }
        System.out.println("=======================================");
    }
    public void outduoi(final File f, String ext)
    {
        System.out.println("Các file đuoi "+ext+" trong "+f.getAbsolutePath());
        if(f.isDirectory())
        {
            File[] chilren =f.listFiles();
            for(File chil : chilren)
            {
                if(chil.getAbsolutePath().endsWith(ext))
                {
                   System.out.println(chil.getAbsolutePath());
                }
            }
        }
        System.out.println("=======================================");
    }
    public void outtime(final File f)
    {
        System.out.println("Thời gian cập nhât cuối cùng của file "
                            +f.getAbsolutePath()+": ");
        if(f.isFile())
        {
            SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
            String strdate =formatter.format(f.lastModified());
            System.out.println("dd/MM/yyyy "+strdate);
        }
        else{
            System.out.println("đây  k phải là file");
        }
    }
    public void outlength(final File f,String type)
    {
        System.out.printf("Kích thước của file "+f.getAbsolutePath()+": ");
        double bytes =f.length();
        if(f.isFile())
        {
            try 
            {                
                if("kb".equalsIgnoreCase(type))
                {
                    double kb=bytes/1024;
                    System.out.println(kb+" Kb \n");
                }
                else
                {
                   double Mb=(bytes/1024)/1024;
                   System.out.println(Mb+" Mb\n");
                }
            }
            catch(AbstractMethodError exception )
            {
                System.out.println("có lỗi");
            }        
            
        }
        else
        {
            System.out.println("đây k phải file");
        }
    }
}
