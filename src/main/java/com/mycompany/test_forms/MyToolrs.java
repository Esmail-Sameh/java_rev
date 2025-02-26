
package com.mycompany.test_forms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class MyToolrs {
    String text;
    
    public MyToolrs(){}
    
    public MyToolrs(String text){
        this.text = text;
    }
   
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
    
    public void  print_Char_By_Char(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
    }
    
    public void word_Count(String text){
        int count = 1;
        String trim = text.trim();
        for(char c : trim.toCharArray()){
            if(c == ' '){
                count += 1;
            }
        }
        System.out.println("Total word is: " + count );
    }
    
}
 