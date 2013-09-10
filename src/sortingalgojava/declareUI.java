
package sortingalgojava;
import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author Makregio
 */
public interface declareUI  {
    processInput mak = new processInput();
    JFrame mainframe = new JFrame("Sorting Algorithms");
    Container frameContent = mainframe.getContentPane();
    JMenuBar menuBar=new JMenuBar();
    JPanel mainpanel = new JPanel();
    JTextField txtin []= new JTextField[10];
    JTextField txtout []= new JTextField[10];
    JRadioButton insertion = new JRadioButton();
    JRadioButton bubble = new JRadioButton();
    JRadioButton merge = new JRadioButton();
    JLabel insertionLabel = new JLabel("Insertion Sort");
    JLabel bubbleLabel = new JLabel("Bubble Sort");
    JLabel mergeLabel = new JLabel("Merge Sort");
    JButton sort = new JButton("Sort");
    JButton deletebtn = new JButton("Delete Entries");
    JTextArea txtarea = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(txtarea);
    ButtonGroup buttons = new ButtonGroup();
    JLabel sortLabel = new JLabel();
    JLabel passLabel = new JLabel("Passes:");
    JLabel execLabel = new JLabel("Execution Time:");
    JLabel passNum = new JLabel();
    JLabel execTime = new JLabel();
    JSeparator vline = new JSeparator(SwingConstants.VERTICAL);
    JSeparator hline = new JSeparator(SwingConstants.HORIZONTAL);
    JLabel footer = new JLabel("Marck Regio | Alshey Micu | Karl Marx Chua | Jeszelle Suetos                                                                                                                                      v0.1");

    
    
    
}
