import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
/**
 * 
 * This class handles the actions of the MenuItem of Database.
 *
 */
public class DatabaseMenuHandler implements ActionListener{
	
	@SuppressWarnings("unused")
	public void actionPerformed( ActionEvent e){
		String menuName = e.getActionCommand();
		
		//This condition shows Database if chosen
		if(menuName.equals("Database")){
			String [] infoDb = new String [100];
			int countDb = 0;
			TextFileInput in = new TextFileInput("Database.txt");
			String line = in.readLine();
			DecimalFormat df = new DecimalFormat("#0.00");
			while (line != null)
			{
				StringTokenizer tokenized = new StringTokenizer(line, ",");
				String match = tokenized.nextToken();
				int code = Integer.parseInt(tokenized.nextToken());
				String name = tokenized.nextToken();
				float price = Float.parseFloat(tokenized.nextToken());
				infoDb[countDb] = name + " \t\t" + df.format(price);
				countDb++;
				
				line = in.readLine();
			}
			new ReceiptGUI(infoDb, countDb);	
		}//end of database
		
		//This condition shows Fruits from the database if chosen
		else if(menuName.equals("Fruits")){
			String [] infoDbF = new String [100];
			int countDbF = 0;
			TextFileInput in = new TextFileInput("Database.txt");
			String line = in.readLine();
			DecimalFormat df = new DecimalFormat("#0.00");
			while (line != null)
			{
				StringTokenizer tokenized = new StringTokenizer(line, ",");
				String match = tokenized.nextToken();
				int code = Integer.parseInt(tokenized.nextToken());
				String name = tokenized.nextToken();
				float price = Float.parseFloat(tokenized.nextToken());
				if(match.equals("F")){
				infoDbF[countDbF] = name + " \t\t" + df.format(price);
				countDbF++;
				}
				line = in.readLine();
			}
			new ReceiptGUI(infoDbF, countDbF);	
		}//end of databaseFruit
		
		//This condition shows Vegetables if chosen
		else if(menuName.equals("Vegetables")){
			String [] infoDbV = new String [100];
			int countDbV = 0;
			TextFileInput in = new TextFileInput("Database.txt");
			String line = in.readLine();
			DecimalFormat df = new DecimalFormat("#0.00");
			while (line != null)
			{
				StringTokenizer tokenized = new StringTokenizer(line, ",");
				String match = tokenized.nextToken();
				int code = Integer.parseInt(tokenized.nextToken());
				String name = tokenized.nextToken();
				float price = Float.parseFloat(tokenized.nextToken());
				if(match.equals("V")){
				infoDbV[countDbV] = name + " \t\t" + df.format(price);
				countDbV++;
				}
				line = in.readLine();
			}//end of databaseVegetables
			new ReceiptGUI(infoDbV, countDbV);
			
		}
	}
}
