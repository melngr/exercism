class RnaTranscription {

    String transcribe(String dnaStrand) {
        if ( dnaStrand != null ) {
            char transcribedStrand[] = new char[ dnaStrand.length() ];
            for ( int i = 0; i < dnaStrand.length(); ++i ) {
                if ( dnaStrand.charAt(i) == 'G' ) { transcribedStrand[i] = 'C'; }
                else if ( dnaStrand.charAt(i) == 'C' ) { transcribedStrand[i] = 'G'; }
                else if ( dnaStrand.charAt(i) == 'T' ) { transcribedStrand[i] = 'A'; }
                else if ( dnaStrand.charAt(i) == 'A' ) { transcribedStrand[i] = 'U'; }
                else { throw new IllegalArgumentException( "Invalid input" ); }
            }
            return new String( transcribedStrand );
        } else {
            return null;
        }
    }

}
