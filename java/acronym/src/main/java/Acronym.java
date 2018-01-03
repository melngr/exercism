class Acronym {

    String _phrase;

    Acronym(String phrase) {
        this._phrase = new String( phrase );
    }

    String get() {
        String splitPhrase[] = ((this._phrase).toUpperCase()).split("[- ]");
        String acronym = "";
        for ( String str : splitPhrase ) {
            acronym += str.charAt(0);
        }
        return acronym;
    }

}
