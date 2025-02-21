
package com.mycompany.test_forms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class CreatFile {

   
    void createFile(){
        try{
            PrintWriter w = new PrintWriter("names.txt");
            w.println("Esmail");
            w.println("Mazen");
            w.println("Tamer");
            w.println("semo");
            w.close();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }
    
}
