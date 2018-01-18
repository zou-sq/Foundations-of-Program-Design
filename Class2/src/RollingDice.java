public class RollingDice{
	public static void main(String[] args) {
		Die die1, die2;
		int sum;
		
		die1 = new Die();
		die2 = new Die();
		
		die1.roll();
		die2.roll();
		System.out.println("Die one: "+die1+", Die Two: "+die2);
		
		die1.roll();
		die2.setFaceValue(4);
		System.out.println("Die One: "+die1+", Die Two: "+die2);
		
		sum = die1.getFaceValue() + die2.getFaceValue();
		System.out.println("Sum: "+sum);
		
		sum = die1.roll() + die2.roll();
		System.out.println("Die One: "+die1+", Die Two: "+die2);
		System.out.println("New sum: "+sum);
	}
}


class Die{                                                                                                                          
	private final int MAX = 6;      //maximum face value
	
	private int faceValue;          //current value showing on the die
	
	//  Constructor: Sets the initial face value.
	public Die() {
		faceValue = 1;
	}
	
	// Rolls the die and return the result.
	public int roll(){
		faceValue = (int)(Math.random() *MAX) + 1;
		return faceValue;
	}
	
	//Face value mutator;
	public void setFaceValue(int value) {
		faceValue = value;
	}
	
	//Face value accessor.
	public int getFaceValue() {
		return faceValue;
	}
	
	// Returns a string representation of this die.
	public String toString() {
		String result = Integer.toString(faceValue);
		
		return result;
	}
	
}