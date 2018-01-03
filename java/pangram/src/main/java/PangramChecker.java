import java.util.ArrayList;
import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.replaceAll( "[^a-zA-Z]", "" ).toLowerCase();
        ArrayList<Character> chars = new ArrayList<Character>();
        for ( char c : input.toCharArray() ) {
            chars.add(c);
        }
        return ( ( new HashSet<Character>(chars) ).size() == 26 );
    }

}
