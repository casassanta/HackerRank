package PracticeAlgorithms

fun divisibleSumPairs(n: Int, k: Int, ar: Array<Int>): Int {

    var countPairs = 0

    for(i in 0 until n-1){
        for(j in i+1 until n )
            if((ar[i]+ar[j]) % k == 0)
                countPairs++

    }

    return countPairs
}