package PracticeAlgorithms

fun DiagonalDifferences(arr: Array<Array<Int>>): Int {
    var d1 = 0
    var d2 = 0

    for(i in 0.. arr.size-1){
        for (j in 0 .. arr[i].size-1){
            if (i == j) d1 += arr[i][j]
            if (i + j == arr[i].size-1) d2 += arr[i][j]
        }
    }

    return Math.abs(d1-d2)
}