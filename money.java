class Dollar {
	Dollar(int amount){
		this.amount = amount;
	}

	Dollar times(int multiplier){
		return new Dollar(amount * multiplier);
	}

	int amount;

	public void testEquality() {
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(5).equals(new Dollar(6)));
	}
	
	public boolean equals(Object object) {
		Dollar dollar = (Dollar) object; //() is type conversion operator
		return amount == dollar.amount;
	}

	public void testMultiplication() {
		Dollar five = new Dollar(5);
		Dollar product = five.times(2);
		assertEquals(10, product.amount);
		product = five.times(3);
		assertEquals(15, product.amount);
	}
}
