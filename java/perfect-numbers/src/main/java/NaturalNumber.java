public class NaturalNumber {

    static Integer _num;

    NaturalNumber(int aNum) {
        if ( aNum > 0 ) { this._num = new Integer( aNum ); }
        else { throw new IllegalArgumentException( 
            "You must supply a natural number (positive integer)" ); }
    }

    Classification getClassification() {
        int aliquot = 0;
        for ( int i = 1; i < this._num; ++i ) {
            if ( this._num % i == 0 ) { aliquot += i; }
        }

        if ( aliquot < this._num ) { return Classification.DEFICIENT; }
        else if ( aliquot == this._num ) { return Classification.PERFECT; }
        else { return Classification.ABUNDANT; }
    }

}
