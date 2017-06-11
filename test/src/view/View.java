/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import javax.swing.JFrame;

/**
 *
 * @author An
 */
public class View extends JFrame{
    public static final int WIDTH=600, HEIGHT=300;
    public Panel pn1 ;
    public Label lb1;
    public View(){
        setTitle("Login");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        setLayout(null);
        pn1 = new Panel(new GridLayout(5, 2));
        lb1  = new Label("Ten Dang Nhap: ");
//        init();
        validate(); 
    }
    public static void main(String[] args) {
        new View().repaint();
    }
}
