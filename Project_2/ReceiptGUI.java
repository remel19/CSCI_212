import java.awt.TextArea;
import javax.swing.JFrame;
 /**
  * 
  * GUI class which will put the output on a windows
  *
  */
public class ReceiptGUI {
    private String [] info;
    private int count;
    private String total;
    private JFrame frame;
    private TextArea text;
     
    /**
     * Constructor
     * @param info passes the info about the produce Item
     * @param count passes the the number of info
     * @param total price/bill
     */
    public ReceiptGUI (String [] info, int count, String total)
    {
        this.info = info;
        this.count = count;
        this.total = total;
        createGUI();
        appendText();
        frame.setVisible(true);
    }//ReceiptGUI
     /**
      * GUI main frame
      */
    public void createGUI ()
    {
        frame = new JFrame("Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        text = new TextArea();
        text.setEditable(false);
        frame.getContentPane().add(text);
    }//createGUI
     /**
      * Adds the info of the transactions into the GUI
      */
    public void appendText ()
    {
        text.setText("ITEM \t PRICE\\LB  \tLBS \tTOTAL");
        text.append("\n\n");
        for (int i=0; i<count; i++)
        {
            text.append(info[i]);
            text.append("\n");
        }//for
         
        text.append("\n\t\t\tTOTAL: $" + total);
    }//appendText
     
     
}//class