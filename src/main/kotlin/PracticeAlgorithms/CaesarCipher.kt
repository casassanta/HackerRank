package PracticeAlgorithms

fun caesarCipher(s: String, k: Int): String{
    val alphabet = "abcdefghijklmnopqrstuvwxyz"
    var result = ""

    s.forEach { char ->
        result += if(alphabet.contains(char, ignoreCase = true)){
            if(char.isUpperCase())
                alphabet[(alphabet.indexOf(char.lowercaseChar()) + k)%26].uppercaseChar()
            else
                alphabet[(alphabet.indexOf(char) + k)%26]
        }else
            char
    }

    return result
}