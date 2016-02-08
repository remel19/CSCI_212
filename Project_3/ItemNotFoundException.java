/**
 * 
 * Throws a message saying that Item is missing.
 *
 */
@SuppressWarnings("serial")
public class ItemNotFoundException extends IllegalArgumentException{
	public ItemNotFoundException(String message) {
		super(message);
	}
}
