package PracticeAlgorithms

fun pangrams(s: String): String {
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    for(i in alphabet.indices){
        if(!s.contains(alphabet[i], ignoreCase = true))
            return "not pangram"
    }

    return "pangram"
}
