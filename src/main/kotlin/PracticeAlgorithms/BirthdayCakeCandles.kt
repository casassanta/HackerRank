package PracticeAlgorithms

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.maxByOrNull { element -> element }
    return candles.filter { element -> element == max }.size
}