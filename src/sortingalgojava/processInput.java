/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgojava;

import java.awt.event.*;
import javax.swing.JFrame;
/**
 *
 * @author marck
 */
public class processInput extends drawUI {
    
    int inputs [] = new int [10];
    public static void main(String[] args) {
        drawIT();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object press = ae.getSource();
        if(press == sort){
            txtarea.setText("");
            pass = 0;
            if(handler.blank() == false && handler.notNum() == false){
                for(loop=0; loop<inputs.length; loop++)
                    inputs [loop] = Integer.parseInt(txtin[loop].getText()); 
            
                if(insertion.isSelected()== true){
                       sortLabel.setText("  sorted numbers using Insertion Sort");
                       Algo.insertion(inputs, inputs.length);
                        for(loop=0;loop<inputs.length; loop++)
                            txtout[loop].setText(""+inputs[loop]);
                }
                if(bubble.isSelected()== true){
                        sortLabel.setText("     sorted numbers using Bubble Sort");
                        Algo.bubble(inputs, inputs.length);
                        for(loop=0;loop<inputs.length; loop++)
                            txtout[loop].setText(""+inputs[loop]);
                }
                if(merge.isSelected()== true){
                        sortLabel.setText("      sorted numbers using Merge Sort");
                        Algo.Merge(inputs, inputs.length);
                        for(loop=0;loop<inputs.length; loop++)
                            txtout[loop].setText(""+inputs[loop]);
                }
            }else
                sortLabel.setText(""+warning);
        }
        if(press == deletebtn){
            for(loop = 0; loop<txtin.length;loop++){
                txtin[loop].setText("");
                txtout[loop].setText("");
            }
            sortLabel.setText("");
            passNum.setText("");
            execTime.setText("");
            txtarea.setText("");
            mainpanel.updateUI();
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
   

}