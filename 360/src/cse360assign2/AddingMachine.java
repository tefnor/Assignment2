/* Name of Author: Tanner Efnor
 * Class ID: 70641
 * Assignment #2
 * Description: Trying to learn how git and github work.
 */
package cse360assign2;

//This class is not really finished at the moment for this portion of the assignment.
public class AddingMachine {

	//Private integer total
	private int total;
	
	//Going to keep track addition and subtractions
	private String history;
	
	//Just sets total equal to zero in this method.
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	//Returns the integer total
	public int getTotal () {
		return total;
	}
	
	//Adds a value to the total
	public void add (int value) {
		
		//Adds to the total
		total = total + value;
		
		//This add the value to history of transactions
		history = history + " + " + value;
	}
	
	//Subtracts a value from the total
	public void subtract (int value) {
		
		//Subtracts to the total
		total = total - value;
		
		//This add the value to history of transactions
		history = history + " - " + value;
		
	}
		
	//Returns all of the whole math problem and its history.
	public String toString () {
		return history;
	}

	//Clears the total and history
	public void clear() {
		total = 0;
		
		history = "0";
	}
}
