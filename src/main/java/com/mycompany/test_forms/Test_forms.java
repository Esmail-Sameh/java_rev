

package com.mycompany.test_forms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Test_forms {

    public static void main(String[] args)   {
//        create_message_box_with_name frm = new create_message_box_with_name();
//        SimpleCalc calc = new SimpleCalc();
//        CalcDateOfBirth db = new CalcDateOfBirth();
//        db.setVisible(true);
//        db.setLocationRelativeTo(null);
        try{
        PrintWriter w = new PrintWriter("Names.txt");
        w.println("Esmail");
        w.println("Ahmed");
        w.println("Temer");
        w.println("Mazen");
        w.close();
        }catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }
}
