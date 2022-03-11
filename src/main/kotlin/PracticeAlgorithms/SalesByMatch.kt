package PracticeAlgorithms

fun salesByMatch(n: Int, ar: Array<Int>): Int {

    var pairs = 0
    val socksGroup = ar.groupBy { it }

    socksGroup.forEach { map ->
        val sizeMap = map.value.size
        if(sizeMap > 1)
            pairs += sizeMap/2
    }

    return pairs
}