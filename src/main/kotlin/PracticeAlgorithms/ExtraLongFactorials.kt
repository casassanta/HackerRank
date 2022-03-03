package PracticeAlgorithms

import java.math.BigInteger

fun extraLongFactorials(n: Int): Unit {
    var factorial: BigInteger = BigInteger("1")

    for(i in n downTo 1)
        factorial *= BigInteger.valueOf(i.toLong())

    println(factorial)
}