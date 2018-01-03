reverseString = function (string) {
    var revString = "";
    for ( var i = (string.length - 1); i >= 0; --i ) {
        revString += string.charAt(i);
    }
    return revString.toString();
};

module.exports = reverseString;