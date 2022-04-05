package Rechner;

import GUI.GUIMain;

import javax.swing.*;

public class Main {
    public static void main(String[] args)  {
        JFrame frame = new JFrame("Autokalkulator");
        frame.setContentPane(new GUIMain().panelMain);
        frame.setSize(300,400);
        frame.pack();
        frame.setVisible(true);
    }
}
