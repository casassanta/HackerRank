import PracticeAlgorithms.compareTriplets
import PracticeAlgorithms.simpleArraySum
import PracticeAlgorithms.solveMeFirst

fun main(args: Array<String>) {


    // println(solveMeFirst(5,6))   //#1

    // println(simpleArraySum(Array(2) { it+1 })) //#2

    val result3 = compareTriplets(arrayOf(5,6,7), arrayOf(3,6,10))
    println("Alice = ${result3[0]} - Bob = ${result3[1]}")
}