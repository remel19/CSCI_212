/**
 * Class Database 
 */
import java.util.StringTokenizer;
 
public class Database {
	Producelist list = new Producelist();
    /**
     * Constructor 
     * @param filename which will be passing as the .txt file
     */
    public Database (String filename){
        readFromFile(filename);
    }//readFromFile
     /**
      * This method reads from the file and assigns the tokens to Fruits and vegetables then adds to the list
      * @param filename which will be passing as the .txt file
      * 
      */
    public void readFromFile (String filename)
    {
        TextFileInput in = new TextFileInput(filename);
        String line = in.readLine();
        while (line != null)
        {
            StringTokenizer tokenized = new StringTokenizer(line, ",");
            String match = tokenized.nextToken();
            String code = tokenized.nextToken();
            String name = tokenized.nextToken();
            float price = Float.parseFloat(tokenized.nextToken());
            if(match == "F"){
                Fruit addFruit = new Fruit(code, name, price);
                list.append(addFruit);
            }//if
            else {
                Vegetable addVegetable = new Vegetable(code, name, price);
                list.append(addVegetable);   
            }//else
            line = in.readLine();
        }//while
    }//readFromFile
     /**
      * 
      * @param code of the transaction 
      * @return the Name of the product from the database
      */
    public String getName (String code){
        return list.Find(code).getName();
    }//getName
     /**
      * 
      * @param code of the transaction
      * @return the price of the product from the database
      */
    public float getPrice (String code){
        return list.Find(code).getPrice();
    }//getPrice
     
    
}//class