import java.awt.TextArea;
import javax.swing.*;

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
    private JMenuBar menubar;
    private JMenu file, database;
    private JMenuItem openFile, quitFile, displdata, displfruit, displveg; 
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
        appendText2();
        frame.setVisible(true);
    }//ReceiptGUI
    
    public ReceiptGUI (String [] info, int count)
    {
        this.info = info;
        this.count = count;
        createGUI();
        appendText();
        frame.setVisible(true);
    }//ReceiptGUI
    
    public ReceiptGUI ()
    {
        createGUI();
        frame.setVisible(true);
    }//ReceiptGUI
     /**
      * GUI main frame
      */
    public void createGUI ()
    {	//frame
        frame = new JFrame("Receipt");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);
        text = new TextArea();
        text.setEditable(false);
        frame.getContentPane().add(text);
        //menuBar
        menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        //fileMenu
        file = new JMenu("File");
        menubar.add(file);
        openFile = new JMenuItem("Open");
        quitFile = new JMenuItem("Quit");
        file.add(openFile);
        openFile.addActionListener(new FileMenuHandler());
        file.add(quitFile);
        quitFile.addActionListener(new FileMenuHandler());
        
        //DatabaseMenu
        database = new JMenu("Database");
        menubar.add(database);
        displdata = new JMenuItem("Database");
        displfruit = new JMenuItem ("Fruits");
        displveg = new JMenuItem("Vegetables");
        database.add(displdata);
        displdata.addActionListener(new DatabaseMenuHandler());
        database.add(displfruit);
        displfruit.addActionListener(new DatabaseMenuHandler());
        database.add(displveg);
        displveg.addActionListener(new DatabaseMenuHandler());
    }//createGUI
    
     /**
      * Adds the info of the transactions into the GUI
      */
    public void appendText ()
    {
        text.setText("ITEM \t\t PRICE\\LB");
        text.append("\n\n");
        for (int i=0; i<count; i++)
        {
            text.append(info[i]);
            text.append("\n");
        }//for
         
    }//appendText
    
    public void appendText2 ()
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