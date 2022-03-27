package PracticeAlgorithms

fun marsExploration(s: String): Int {
    var missedMessage = 0

    for(i in 0 until s.length - 2 step 3) {
        if (s[i] != 'S')
            missedMessage++
        if(s[i + 1] != 'O')
            missedMessage++
        if(s[i + 2] != 'S')
            missedMessage++
    }

    return missedMessage
}