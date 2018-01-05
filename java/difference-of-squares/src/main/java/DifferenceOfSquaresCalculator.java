class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        return ( (Double.valueOf(Math.pow( ((input * (input + 1)) / 2), 2))).intValue() );
    }

    int computeSumOfSquaresTo(int input) {
        return ( (Double.valueOf( ((input * (input + 1) * (2*input + 1)) / 6) )).intValue() );
    }

    int computeDifferenceOfSquares(int input) {
        return ( Math.abs( computeSquareOfSumTo(input) - computeSumOfSquaresTo(input) ) );
    }

}
