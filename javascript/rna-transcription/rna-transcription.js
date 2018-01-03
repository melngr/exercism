var DnaTranscriber = function () {};

DnaTranscriber.prototype.toRna = function (dna) {
    var rna = "";
    for ( var i = 0; i < dna.length; ++i ) {
        if ( dna.charAt(i) == 'C' ) { rna += 'G'; }
        else if ( dna.charAt(i) == 'G' ) { rna += 'C'; }
        else if ( dna.charAt(i) == 'A' ) { rna += 'U'; }
        else if ( dna.charAt(i) == 'T' ) { rna += 'A'; }
        else { throw new Error( "Invalid input" ); }
    }
    return rna;
};

module.exports = DnaTranscriber