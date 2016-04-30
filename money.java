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
	
	public boolean equals(Object Object) {
		return true;
	}

	public void testMultiplication() {
		Dollar five = new Dollar(5);
		five.times(2);
		assertEquals(10, five.amount);
		five.times(3);
		assertEquals(15, five.amount);
	}
}
