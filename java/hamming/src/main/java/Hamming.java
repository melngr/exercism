class Hamming {

    String _left, _right;

    Hamming(String leftStrand, String rightStrand) {
        if ( leftStrand.length() == rightStrand.length() ) {
            this._left = new String( leftStrand );
            this._right = new String( rightStrand );
        } else {
            throw new IllegalArgumentException( 
                "leftStrand and rightStrand must be of equal length." );
        }
    }

    int getHammingDistance() {
        int diff = 0;
        for ( int i = 0; i < (this._left).length(); ++i ) {
            if ( (this._left).charAt(i) != (this._right).charAt(i) ) { ++diff; }
        }
        return diff;
    }

}
