

package com.mycompany.test_forms;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Test_forms {

    public static void main(String[] args)   {
//        create_message_box_with_name frm = new create_message_box_with_name();
//        SimpleCalc calc = new SimpleCalc();
//        CalcDateOfBirth db = new CalcDateOfBirth();
        SaveEmpData sed = new SaveEmpData();
        sed.setVisible(true);
        sed.setLocationRelativeTo(null);
  

    }
}
