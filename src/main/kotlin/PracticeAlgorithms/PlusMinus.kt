package PracticeAlgorithms


fun plusMinus(arr: Array<Int>): Unit {
    val positive: Float = arr.filter { element -> element > 0}.size.toFloat()
    val negative: Float = arr.filter { element -> element < 0}.size.toFloat()
    val zeros: Float = arr.size - positive - negative

    println("%.6f".format(positive/arr.size))
    println("%.6f".format(negative/arr.size))
    println("%.6f".format(zeros/arr.size))
}