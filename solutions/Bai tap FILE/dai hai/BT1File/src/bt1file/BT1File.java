/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1file;

import java.io.File;

/**
 *
 * @author topmu
 */
public class BT1File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileUtils  fl = new FileUtils();
        File f = new File("C:\\Users\\topmu\\Pictures");
        File k = new File("C:\\Users\\topmu\\Pictures\\2.jpg");
        fl.outfoder(f);
        fl.outfile(f);
        fl.outpng(f);
        fl.outduoi(f,".mp4");
        fl.outtime(k);
        fl.outlength(k, "kB");
    }
    
}
