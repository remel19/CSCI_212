import java.awt.TextArea;
import javax.swing.JFrame;
 
public class ReceiptGUI {
    private String [] info;
    private int count;
    private String total;
    private JFrame frame;
    private TextArea text;
     
 
    public ReceiptGUI (String [] info, int count, String total)
    {
        this.info = info;
        this.count = count;
        this.total = total;
        createGUI();
        appendText();
        frame.setVisible(true);
    }
     
    public void createGUI ()
    {
        frame = new JFrame("Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        text = new TextArea();
        text.setEditable(false);
        frame.getContentPane().add(text);
    }
     
    public void appendText ()
    {
        text.setText("ITEM \t PRICE\\LB  \tLBS \tTOTAL");
        text.append("\n\n");
        for (int i=0; i<count; i++)
        {
            text.append(info[i]);
            text.append("\n");
        }
         
        text.append("\n\t\t\tTOTAL: $" + total);
    }
     
     
}