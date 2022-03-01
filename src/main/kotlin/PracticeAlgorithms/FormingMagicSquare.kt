package PracticeAlgorithms

fun formingMagicSquare(s: Array<Array<Int>>): Int {

    val size = s.size
    val squareFlatten = s.flatten()
    val missingNumbers = arrayListOf(1,2,3,4,5,6,7,8)

    squareFlatten.map { element ->
        if (missingNumbers.contains(element))
            missingNumbers.remove(element)
    }

    if(isMagicSquare(squareFlatten, size))
        println("Magic Square")
    else
        println("Not a Magic Square")


    return 1
}

fun isMagicSquare(array: List<Int>, size: Int): Boolean{

    // Check Lines
    for( i in array.indices){
        if (i % size == 0 ){
            var sum = 0

            for(j in i until i + size)
                sum += array[j]

            if(sum != 15)
                return false
        }
    }

    // Check Columns
    for ( i in 0 until size){
        var sum = 0

        for( j in i until array.size step size)
            sum += array[j]

        if(sum != 15)
            return false
    }

    // Check Main Diagonal
    val diagonalMain = array.foldIndexed(0) { index, acc, element ->
        if(index % (size+1) == 0) acc + element else acc
    }

    val diagonalReverse = array.reversed().foldIndexed(0) { index, acc, element ->
        if(index % (size+1) == 0) acc + element else acc
    }

    if(diagonalMain != 15 || diagonalReverse != 15)
        return false



    return true
}