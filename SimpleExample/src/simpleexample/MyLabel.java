/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexample;

import javax.swing.JLabel;

/**
 * Class representing simple example of swing framework
 * 
 * @author Filip Valchář
 */
public class MyLabel extends JLabel {
    
    public MyLabel() {
        super("", null, LEADING);
    }

    @Override
    public boolean isOpaque() {
        return true;
    }
    
}
