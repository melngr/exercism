import java.util.ArrayList;

class RaindropConverter {

    String convert(int number) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for ( int i = 1; i <= number; ++i ) {
            if ( number % i == 0 ) { factors.add(i); }
        }

        String raindrop = "";
        if ( factors.contains(3) || factors.contains(5) || factors.contains(7) ) {
            if ( factors.contains(3) ) { raindrop += "Pling"; }
            if ( factors.contains(5) ) { raindrop += "Plang"; }
            if ( factors.contains(7) ) { raindrop += "Plong"; }
        } else {
            raindrop = Integer.toString( number );
        }
        return raindrop;
    }

}
