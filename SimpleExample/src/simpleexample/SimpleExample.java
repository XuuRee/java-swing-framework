/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexample;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Class representing simple example of swing framework
 * 
 * @author Filip Valchář
 */
public class SimpleExample extends JFrame {

     public SimpleExample() {
        initUI();
    }

    private void initUI() {
        
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            SimpleExample ex = new SimpleExample();
            ex.setVisible(true);
        });
    }
    
}
