class ReverseString {

    String reverse(String inputString) {
        if ( inputString != null  ) {
            char rev[] = new char[ inputString.length() ];
            int i, j = 0;
            for ( i = (inputString.length() - 1); i >= 0; --i, ++j ) {
                rev[j] = inputString.charAt(i);
            }
            return new String( rev );
        } else {
            return null;
        }
    }
  
}