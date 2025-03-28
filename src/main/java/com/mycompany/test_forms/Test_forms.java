package com.mycompany.test_forms;

import forms.MainForm;

public class Test_forms {

    public static void main(String[] args)   {

        MainForm frmMain = new MainForm();
//        frmMain.setVisible(true);
//        frmMain.setLocationRelativeTo(null);
        
        MyToolrs mt = new MyToolrs("HELLO APOSEMO");
        mt.runForm(frmMain);


    }
}
