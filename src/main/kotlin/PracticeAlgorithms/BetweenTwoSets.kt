package PracticeAlgorithms

fun betweenTwoSets(a: Array<Int>, b: Array<Int>): Int {

    val min = a.toList().sorted()[0]
    val max = b.toList().sortedDescending()[0]
    var count = 0

    for(i in min .. max){
        if(a.toList().filter { i % it == 0 }.size == a.size && b.toList().filter { it % i == 0}.size == b.size)
            count++
    }

    return count
}