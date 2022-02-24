package PracticeAlgorithms

fun stairCase(n: Int): Unit {
    for(i in 1 .. n){
        for(j in i.. n-1)
            print(" ")
        for(k in i downTo 1)
            print("#")
        if(i < n)
            println("")
    }
}