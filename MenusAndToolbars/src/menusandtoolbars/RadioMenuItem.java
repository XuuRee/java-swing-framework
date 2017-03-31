/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusandtoolbars;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;


public class RadioMenuItem extends JFrame {

    private JLabel statusbar;

    public RadioMenuItem() {
        initUI();
    }

    private void initUI() {

        createMenuBar();

        statusbar = new JLabel("Easy");
        statusbar.setBorder(BorderFactory.createEtchedBorder());
        add(statusbar, BorderLayout.SOUTH);

        setTitle("JRadioButtonMenuItem");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        JMenu difMenu = new JMenu("Difficulty");
        difMenu.setMnemonic(KeyEvent.VK_F);

        ButtonGroup difGroup = new ButtonGroup();

        JRadioButtonMenuItem eaRMi = new JRadioButtonMenuItem("Easy");
        eaRMi.setSelected(true);
        difMenu.add(eaRMi);

        eaRMi.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                statusbar.setText("Easy");
            }
        });

        JRadioButtonMenuItem meRMi = new JRadioButtonMenuItem("Medium");
        difMenu.add(meRMi);

        meRMi.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                statusbar.setText("Medium");
            }
        });

        JRadioButtonMenuItem haRMi = new JRadioButtonMenuItem("Hard");
        difMenu.add(haRMi);

        haRMi.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                statusbar.setText("Hard");
            }
        });

        difGroup.add(eaRMi);
        difGroup.add(meRMi);
        difGroup.add(haRMi);

        menubar.add(difMenu);

        setJMenuBar(menubar);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            RadioMenuItem ex = new RadioMenuItem();
            ex.setVisible(true);
        });
    }
    
}
