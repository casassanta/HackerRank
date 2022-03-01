package PracticeAlgorithms

fun numbersLinesJump(x1: Int, v1: Int, x2: Int, v2: Int): String {

    var diffX = x1 - x2
    var diffV = v1 - v2

    if (x1 > x2 && v1 >= v2)
        return "NO"
    if (x2 > x1 && v2 >= v1)
        return "NO"
    if (x1 == x2 && v1 != v2)
        return "NO"

    return if (diffX % diffV == 0)
        "YES"
    else
        "NO"
}