package PracticeAlgorithms

fun pickingNumbers(a: Array<Int>): Int {

    val mapNumbers = a.groupBy { it }
    val mapKeys = mapNumbers.keys.toList()
    var maxSize = 0

    for( i in mapKeys.indices){
        val amountA = mapNumbers[mapKeys[i]]?.size ?: 0
        val amountB = mapNumbers[mapKeys[i] - 1]?.size ?: 0
        if(maxSize < amountA + amountB)
            maxSize = amountA + amountB
    }

    return maxSize
}
