package PracticeAlgorithms

fun twoCharacters(s: String): Int {

    val charactersAvailable = s.toCharArray().distinct().sorted()
    val charactersCombinantion = mutableListOf<List<Char>>()
    val validStringsSize = mutableListOf<Int>()

    charactersAvailable.forEachIndexed { index, char ->
        val remainChar = charactersAvailable.subList(index + 1, charactersAvailable.size)
        remainChar.forEach { secondChar ->
            charactersCombinantion.add(listOf(char, secondChar))
        }
    }

    if(charactersCombinantion.size == 0)
        return 0

    charactersCombinantion.forEach { charTuple ->
        val string = s.filter { char -> charTuple.contains(char) }
        if(isValidString(string))
            validStringsSize.add(string.length)
    }

    if(validStringsSize.size == 0)
        return 0

    return validStringsSize.sorted().last()
}

fun isValidString(s: String): Boolean{
    for(i in 0 until s.length - 1){
        if(s[i] == s[i+1])
            return false
    }
    return true
}