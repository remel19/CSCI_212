import java.util.StringTokenizer;
 
public class Database {
    private ProduceItem [] produceItems;
    private int count;
     
    public Database (String filename)
    {
        produceItems = new ProduceItem [100];
        count = 0;
        readFromFile(filename);
    }
     
    public void readFromFile (String filename)
    {
        TextFileInput in = new TextFileInput(filename);
        String line = in.readLine();
        while (line != null && count < produceItems.length)
        {
            StringTokenizer tokenized = new StringTokenizer(line, ",");
            String code = tokenized.nextToken();
            String name = tokenized.nextToken();
            float price = Float.parseFloat(tokenized.nextToken());
            addProduce(code, name, price);
            line = in.readLine();
        }//while
    }//readFromFile
     
    public String getName (String code)
    {
        for (int i=0; i<count; i++)
            if (produceItems[i].getCode().equals(code))
                return produceItems[i].getName();
        return null;
    }//getName
     
    public float getPrice (String code)
    {
        for (int i=0; i<count; i++)
            if (produceItems[i].getCode().equals(code))
                return produceItems[i].getPrice();
        return 0f;
    }//getPrice
     
    private void addProduce (String code, String name, float price)
    {
        produceItems[count] = new ProduceItem(code, name, price);
        count++;
    }//addProduce
     
}//class