/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgojava;

/**
 *
 * @author Makregio
 */
public abstract class handler extends drawUI {
    public static boolean blank(){
        boolean boo = false;
        for(loop=0; loop<txtin.length;loop++){
            if(txtin[loop].getText().equals("")){
                boo = true;
                warning = "                     Textbox is not filled";
                break;
            }
        }
        return boo;
    }
    public static boolean notNum(){
        boolean boo = false;
        for(loop = 0; loop<txtin.length;loop++){
            char txtvalue [] = txtin[loop].getText().toCharArray();
            for(int charLength=0; charLength < txtvalue.length; charLength++){               
                if(txtin[loop].getText().charAt(charLength) >= (int)'a' && txtin[loop].getText().charAt(charLength) <= (int)'z'){
                    boo = true;
                    warning = "         Textbox is filled with letters";
                }
                else if(txtin[loop].getText().charAt(charLength) >= (int)'A' && txtin[loop].getText().charAt(charLength) <= (int)'Z'){
                    boo = true;
                    warning = "         Textbox is filled with letters";
                }
                else if(txtin[loop].getText().charAt(charLength) == (int)' '){
                    boo = true;
                    warning = "         Textbox is filled with spaces";
                }
                else if(!(txtin[loop].getText().charAt(charLength) >= (int)'0' && txtin[loop].getText().charAt(charLength) <= (int)'9')){
                    boo = true;
                    warning = "Textbox is filled with special characters";
                }
            }
        }
        return boo;
    }
    public static boolean isSorted(int [] list){
        boolean boo = true;
        for(loop = 0; loop < list.length-1; loop++){
            if(list[loop] > list[loop+1])
                boo = false;
        }
        return boo;
    }
}