package PracticeAlgorithms

fun funnyString(s: String): String {
    val asciiString = s.map { char -> char.hashCode() }
    val asciiStringReversed = s.reversed().map { char -> char.hashCode() }

    for(i in 0 until asciiString.size - 1){
        if( Math.abs(asciiString[i] - asciiString[i + 1]) != Math.abs(asciiStringReversed[i] - asciiStringReversed[i+1]))
            return "Not Funny"
    }

    return "Funny"
}