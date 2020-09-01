/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2.file;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author topmu
 */
public class Bt2File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        simple sp= new simple();
        File f = new File("D:\\Hai2.txt");
        sp.creationFile(f);
        sp.soanthao();
        sp.outdoc(f);
    }
    
}
