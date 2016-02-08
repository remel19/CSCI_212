/**
 * 
 * LinkedList for ProduceItem
 *
 */
public class Producelist {
		
	   private ProduceNode first; 
	   private ProduceNode last; 
	   /**
	    * Constructor
	    */
	   public Producelist () {
	         ProduceNode ln = new ProduceNode();
	         first = ln;
	         last = ln;
	      } //constructor
	   /**
	    * 
	    * @param s will be added in the Producelist
	    */
	   public void append (ProduceItem s) {
	      ProduceNode n = new ProduceNode(s);
	      last.next = n;
	      last = n;
	   }//append
	   
	   /**
	    * 
	    * @param code the product that the program will be looking for
	    * @return the item that found
	    */
	   public ProduceItem Find(String code){
		   ProduceNode current = first.next;
			while((!current.data.getCode().equals(code)) && (current.next != null)){
				current = current.next;
			}	
			return current.data;	

	   }//Find
	   
} // class Producelist
