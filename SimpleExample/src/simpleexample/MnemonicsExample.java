/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleexample;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * Class representing simple example of swing framework
 * 
 * @author Filip Valchář
 */
public class MnemonicsExample extends JFrame {

    public MnemonicsExample() {
        initUI();
    }

    private void initUI() {

        JButton btn = new JButton("Button");
        btn.addActionListener((ActionEvent e) -> { System.out.println("Button pressed"); });
        btn.setMnemonic(KeyEvent.VK_B);

        createLayout(btn);

        setTitle("Mnemonics");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);
        gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]).addGap(200));
        gl.setVerticalGroup(gl.createParallelGroup().addComponent(arg[0]).addGap(200));

        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MnemonicsExample ex = new MnemonicsExample();
            ex.setVisible(true);
        });
    }
    
}
