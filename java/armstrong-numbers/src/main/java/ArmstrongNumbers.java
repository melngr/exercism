class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		int sum = 0;
		String numberString = Integer.toString(numberToCheck);
		for ( int i = 0; i < numberString.length(); ++i ) {
			sum += ( Math.pow( Integer.parseInt( numberString.valueOf( 
				numberString.charAt(i) ) ), numberString.length() ) );
		}
		return ( sum == numberToCheck );
	}

}
