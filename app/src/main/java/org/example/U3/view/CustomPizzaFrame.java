package org.example.U3.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.example.U3.controller.Controller;

public class CustomPizzaFrame extends JFrame implements ActionListener {
    private JPanel mainPanel;

    private Controller controller;

    public CustomPizzaFrame(Controller controller) {
        mainPanel = new JPanel(new GridLayout(1, 1));
        setSize(600, 400);
        this.setContentPane(mainPanel);
        setupPanel();
        this.setTitle("Create your own pizza!");
        this.setVisible(true);
        this.setResizable(false);
        this.controller = controller;
    }

    public void setupPanel() {
        /*
         * TODO: Skapa ny pizza här och spara den.
         */
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
         * TODO: Skapa ny pizza här och spara den.
         */

    }
}
