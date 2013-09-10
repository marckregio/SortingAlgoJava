/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgojava;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author marck
 */
public abstract class drawUI implements ActionListener, KeyListener, declareUI{
    static int loop = 0, inc = 20;
    static String warning = "";
    static int pass = 0;
    public static void drawIT(){
        drawFrame();
        drawPanels();
        drawtxtBox();
        drawButtons();
        drawPass();
        mainframe.setVisible(true);
    }
    public static void drawFrame(){
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setResizable(false);
        mainframe.setSize(800, 310);
        mainframe.setLocationRelativeTo(null);
    }
    public static void drawPanels(){  
        mainpanel.setLayout(null);
        mainpanel.setBackground(Color.DARK_GRAY);
        mainframe.add(mainpanel);
        
        vline.setBounds(385, 0, 2, 250);
        mainpanel.add(vline);
        hline.setBounds(10, 250, 780, 2);
        mainpanel.add(hline);
        
        footer.setBounds(10,260,800,13);
        footer.setOpaque(false);
        footer.setForeground(Color.GRAY);
        mainpanel.add(footer);
    }
   
    
    public static void drawtxtBox(){
        for(loop = 0; loop<txtin.length; loop++){
            txtin[loop] = new JTextField("");
            txtin[loop].setDocument(new JTextFieldLimit(10));
            txtin[loop].setHorizontalAlignment(JTextField.CENTER);
            txtin[loop].setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
            txtin[loop].setBounds(inc,20,30,30);
            mainpanel.add(txtin[loop]);

            txtout[loop] = new JTextField("");
            txtout[loop].setHorizontalAlignment(JTextField.CENTER);
            txtout[loop].setBorder(BorderFactory.createLineBorder(Color.PINK, 2));
            txtout[loop].setEditable(false);
            txtout[loop].setBounds(inc,200,30,30);
            mainpanel.add(txtout[loop]);

            inc += 36;
        }
    }
    public static void drawButtons(){
        insertion.setBounds(30,70 ,20, 20);
        insertion.setBackground(Color.DARK_GRAY);
        insertionLabel.setBounds(50,70, 100,20);
        insertionLabel.setForeground(Color.LIGHT_GRAY);
        bubble.setBounds(160,70,20,20);
        bubble.setBackground(Color.DARK_GRAY);
        bubbleLabel.setBounds(180,70, 100, 20);
        bubbleLabel.setForeground(Color.LIGHT_GRAY);
        merge.setBounds(270,70,20,20);
        merge.setBackground(Color.DARK_GRAY);
        mergeLabel.setBounds(290,70,90,20);
        mergeLabel.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(insertion);
        mainpanel.add(insertionLabel);
        mainpanel.add(bubble);
        mainpanel.add(bubbleLabel);
        mainpanel.add(merge);
        mainpanel.add(mergeLabel);
        buttons.add(insertion);
        buttons.add(bubble);
        buttons.add(merge);

        sort.setBounds(40, 100, 150, 60);
        deletebtn.setBounds(210, 100, 150, 60);
        mainpanel.add(sort);
        sort.addActionListener(mak);
        mainpanel.add(deletebtn);
        deletebtn.addActionListener(mak);
    }
    public static void drawPass(){
        sortLabel.setBounds(80, 170, 280, 20);
        sortLabel.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(sortLabel);
        passLabel.setBounds(410,25,100,20);
        passLabel.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(passLabel);
        passNum.setBounds(480,25,100,20);
        passNum.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(passNum);
        execLabel.setBounds(540,25,200,20);
        execLabel.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(execLabel);
        execTime.setBounds(660,25,200,20);
        execTime.setForeground(Color.LIGHT_GRAY);
        mainpanel.add(execTime);
        scrollPane.setBounds(410, 50, 370, 180);
        
        txtarea.setEditable(false);
        txtarea.setLineWrap(false);
        mainpanel.add(scrollPane);
    }
}