/**
 * @author Remel Kabir
 * @Course CSCI 212
 * @Assignment Project2
 * @LabSection F 
 * 
 */
import java.text.DecimalFormat;
import java.util.StringTokenizer;
 

public class Project2 {
	/**
	 * 
	 * Main which will execute the program
	 * 
	 */
    public static void main (String [] args)
    {
        Database db = new Database("database2.txt");
        String [] info = new String [100];
        int count = 0;
        float totalForAll = 0f;
         
        TextFileInput in = new TextFileInput("transactions2.txt");
        String line = in.readLine();
        DecimalFormat df = new DecimalFormat("#0.00");
         
        while (line != null)
        {
            StringTokenizer tokenized = new StringTokenizer(line, ",");
            String code = tokenized.nextToken();
            float weight = Float.parseFloat(tokenized.nextToken());
             
            String name = db.getName(code);
            float price = db.getPrice(code);
             
            float totalForItem = weight * price;
            totalForAll += totalForItem;
             
            info[count] = name + "\t     " + price + "\t" + df.format(weight) + " \t$" + df.format(totalForItem);
            count++;
             
            line = in.readLine();
        }//While
         
        new ReceiptGUI(info, count, df.format(totalForAll));
         
    }//main
}