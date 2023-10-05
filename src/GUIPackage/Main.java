package GUIPackage;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame calculator1 = new JFrame("GUITest");
        calculator1.setContentPane(new calculatorGUI().getCalculatorPanel());
        calculator1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculator1.pack();
        calculator1.setVisible(true);

    }
}