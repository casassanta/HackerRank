package PracticeAlgorithms

fun subArrayDivision(s: Array<Int>, d: Int, m: Int): Int {
    var countBars = 0

    for(i in s.indices){
        var sum = 0

        if(i + m <= s.size)
            for( j in i until i+m)
                sum += s[j]

        if(sum == d)
            countBars++

    }

    return countBars
}