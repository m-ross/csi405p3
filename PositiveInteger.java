public class PositiveInteger extends Semigroup<PositiveInteger> {
	private int posInt;
	
	public PositiveInteger() {
		this(0);
	}
	
	public PositiveInteger(int posInt) {
		if (posInt >= 0) {
			this.posInt = posInt;
		}
		else {
			throw new IllegalArgumentException();
		}
	}
	
	public int getInt() {
		return posInt;
	}
	
	public PositiveInteger operator(PositiveInteger posInt) {
		PositiveInteger newPosInt;
		int sum;
		
		sum = posInt.getInt() + this.posInt;
		newPosInt = new PositiveInteger(sum);
		
		return newPosInt;
	}
}