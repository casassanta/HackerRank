package PracticeAlgorithms

fun countApplesAndOranges(s: Int, t: Int, a: Int, b: Int, apples: Array<Int>, oranges: Array<Int>): Unit {

    var totalApples = 0
    var totalOranges = 0

    apples.map { apple ->
        val positionAppleFall = a + apple
        if(positionAppleFall in s..t)
            totalApples+= 1
    }

    oranges.map { orange ->
        val positionOrangeFall = b + orange
        if(positionOrangeFall in s .. t )
            totalOranges+=1
    }

    println(totalApples)
    println(totalOranges)

}
