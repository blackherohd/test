/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JFrame;

/**
 *
 * @author An
 */
public class View extends JFrame{
    public static final int WIDTH=600, HEIGHT=300;
    public View(){
        setTitle("Login");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setLayout(null);
//        init();
        validate();
    }
    public static void main(String[] args) {
        new View().repaint();
    }
}
