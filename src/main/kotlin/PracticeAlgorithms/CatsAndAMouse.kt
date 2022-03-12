package PracticeAlgorithms

fun catAndMouse(x: Int, y: Int, z: Int): String {

    val difCatA = Math.abs(x-z)
    val difCatB = Math.abs(y-z)

    return if (difCatA == difCatB)
        "Mouse C"
    else if(difCatA < difCatB)
        "Cat A"
    else
        "Cat B"
}