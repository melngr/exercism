import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    static ArrayList<Signal> signals = new ArrayList<Signal>() {{
        add(Signal.WINK);  add(Signal.DOUBLE_BLINK);
        add(Signal.CLOSE_YOUR_EYES);  add(Signal.JUMP);
    }};

    List<Signal> calculateHandshake(int number) {
        boolean rev = ( number >= 16 );
        while ( number >= 16 ) { number -= 16; }
        
        String binNumber = Integer.toBinaryString( number );
        List<Signal> handshake = new ArrayList<Signal>();
        for ( int i = (binNumber.length() - 1); i >= 0; --i ) {
            if ( binNumber.charAt(i) == '1' ) {
                handshake.add( signals.get( (binNumber.length() - 1 - i) ) );
            }
        }

        if ( rev ) { Collections.reverse( handshake ); }
        return handshake;
    }

}
