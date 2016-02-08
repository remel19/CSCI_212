
/**
 * 
 * class ProduceNode to create Linked List
 *
 */
public class ProduceNode {
	   ProduceItem data;
	   ProduceNode next;
	   /**
	    * Constructor
	    * @param data sets the value 
	    * @param next sets the value
	    */
	   public ProduceNode(ProduceItem data, ProduceNode next)  {
	      this.data = data;
	      this.next = next;
	   }  // constructor
	   /**
	    * Constructor setting the value to null if there are no parameter
	    */
	   public ProduceNode()  {
	      this.data = null;
	      this.next = null;
	   }  // constructor
	   /**
	    * Constructor setting the value to only data if one value passed
	    * @param data sets the value
	    */
	   public ProduceNode(ProduceItem data)  {
	      this.data = data;
	      this.next = null;
	   }  // constructor
}  // class ShortNode
