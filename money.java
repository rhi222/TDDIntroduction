class Dollar {
	Dollar(int amount){
		this.amount = amount;
	}
	void times(int multiplier){
		amount = amount * multiplier;
	}
	int amount;
	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
	}
}
