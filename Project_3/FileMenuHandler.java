import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

/**
 * 
 * This class handles the MenuItem of the File
 *
 */
public class FileMenuHandler implements ActionListener{
	public void actionPerformed(ActionEvent e){
		String menuName = e.getActionCommand();
		
		//Shows Transactions from the file
		if(menuName.equals("Open")){
			Database db = new Database("database.txt");
	        String [] info = new String [100];
	        int count = 0;
	        float totalForAll = 0f;
	        
			TextFileInput in = new TextFileInput("transactions_error.txt");
			String line = in.readLine();
			DecimalFormat df = new DecimalFormat("#0.00");
			
			/*
			 * My try and catch block isn't working.
			 * It's not giving me the JOptionPane.
			 * Instead It's repeating the Onions-Red three times which is the last code in the
			 * database and multiplying the weight that was given in the transactions_error with
			 * Onions-Red's price from database and giving me the price.
			 * Tried writing in different ways the try and catch but not working.
			 * 
			 */
			while (line != null)
	        {
				StringTokenizer tokenized = new StringTokenizer(line, ",");
				String code = tokenized.nextToken();
				float weight = Float.parseFloat(tokenized.nextToken());
				String name = db.getName(code);
				float price = db.getPrice(code);
				if (name == null ) {
		        	 try{
		        		 String thePrice = JOptionPane.showInputDialog(null,"Item not found. Enter the price for this item");
		        		 price = Float.parseFloat(thePrice);
		         }
		        	 catch(ItemNotFoundException infe){
		        		 JOptionPane.showMessageDialog(null,"Item not found");
		        	 }
				}
				
				float totalForItem = weight * price;
				totalForAll += totalForItem;
				
				info[count] = name + "\t     " + price + "\t" + df.format(weight) + " \t$" + df.format(totalForItem);
				
				count++;
			line = in.readLine();
	        }//While
	         
	        new ReceiptGUI(info, count, df.format(totalForAll));
	         
		}
		//Quits the program
		else if(menuName.equals("Quit")){
			System.exit(0);
		}
	}
}
