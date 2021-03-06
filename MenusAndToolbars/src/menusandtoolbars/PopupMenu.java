/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menusandtoolbars;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;


public class PopupMenu extends JFrame {

    private JPopupMenu pmenu;

    public PopupMenu() {
        initUI();
    }

    private void initUI() {

        createPopupMenu();

        setTitle("JPopupMenu");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createPopupMenu() {

        pmenu = new JPopupMenu();
        
        JMenuItem maxMi = new JMenuItem("Maximize");
        maxMi.addActionListener((ActionEvent e) -> {
            if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
                setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });

        pmenu.add(maxMi);

        JMenuItem quitMi = new JMenuItem("Quit");
        quitMi.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        pmenu.add(quitMi);

        addMouseListener(new MouseAdapter() {

            @Override
            public void mouseReleased(MouseEvent e) {

                if (e.getButton() == MouseEvent.BUTTON3) {
                    pmenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            PopupMenu pm = new PopupMenu();
            pm.setVisible(true);
        });
    }
    
}
