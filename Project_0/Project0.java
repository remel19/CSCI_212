//Remel Kabir
//CSCI 212
//Lab Section- 11F

import javax.swing.JOptionPane; //importing the library
public class Project0 {

	public static void main(String[] args) {
		while(true){//infinite loop until stop is entered
			String input = JOptionPane.showInputDialog("Please Enter a sentence");//taking an input from the user.
			int LowerE = 0;//initial value
			int UpperE = 0;//initial value
			String y = "Stop";
			if(y.equalsIgnoreCase(input)){ // checking if the input is stop
				return;
			}
			else{
				for(int i=0; i<input.length(); i++){ // loop  starting from 0 till hits the number of characters in the string
					if(input.charAt(i) =='e'){//looking for character e
						LowerE++;//adding character e to the initial value
					}
					else if(input.charAt(i) == 'E'){//looking for character E
						UpperE++;//adding character E to the initial value
					}
				}
				//printing the number of lower e's and upper E's
				JOptionPane.showMessageDialog(null, "Number of lower case e's: "+ LowerE + "\nNumber of upper case e's: "+ UpperE);
			}
		}
	}

}
