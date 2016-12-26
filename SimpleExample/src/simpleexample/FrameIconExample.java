/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexample;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 * Class representing simple example of swing framework
 * 
 * @author Filip Valchář
 */
public class FrameIconExample extends JFrame {
    
    public FrameIconExample() {
        initUI();
    }
    
    private void initUI() {
        
        ImageIcon webIcon = new ImageIcon("web.png");

        setIconImage(webIcon.getImage());

        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            FrameIconExample ex = new FrameIconExample();
            ex.setVisible(true);
        });
    }
    
}
