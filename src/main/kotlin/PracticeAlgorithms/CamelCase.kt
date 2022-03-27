package PracticeAlgorithms

fun camelcase(s: String): Int {
    var words = 0

    s.toCharArray().forEach { char ->
        if(char.isUpperCase())
            words++
    }

    return if(words >=1)
        words + 1
    else
        1
}
