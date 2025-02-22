
package com.mycompany.test_forms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MyToolrs {

   
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
    
    public static void runForm(JFrame frm) {
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
    
}
