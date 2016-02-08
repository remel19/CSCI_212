/**
 * 
 * The Abstract class of the ProduceItem
 *
 */
public abstract class ProduceItem {
	private String code;
	private String name;
	private float price;
	/**
	 * 
	 * @param code will sets the code of product 
	 * @param name will sets the name of product
	 * @param price will sets the price of product
	 */
	public ProduceItem(String code, String name, float price)
	{
		this.code = code;
		this.name = name;
		this.price = price;
	}//constructor
	
	public String toString ()
	{
		return code + ", " + name + ", " + price; 
	}
	/**
	 * 
	 * @returns the code , the name and the price
	 */
	public String getCode () {	return code; }
	public String getName () {	return name; }
	public float getPrice () {	return price; }
	/**
	 * 
	 * @param sets the code, the name and the price
	 */
	public void setCode (String code) { this.code = code; }
	public void setName (String name) { this.name = name; }
	public void setPrice (float price) { this.price = price; }
	
}//class


