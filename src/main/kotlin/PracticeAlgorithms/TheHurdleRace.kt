package PracticeAlgorithms

fun theHurdleRace(k: Int, height: Array<Int>): Int {
    val maxHeight = height.maxOf { it }

    return if(k >= maxHeight)
        0
    else
        maxHeight - k
}