package PracticeAlgorithms

fun drawingBook(n: Int, p: Int): Int {

    var flipPages = 0
    val book = IntArray(n) { it + 1}

    if(p >= n/2){
        for(i in n-1 downTo 1 step 2)
            if(book[i] == p || book[i-1] == p)
                return flipPages
            else
                flipPages++
    }else{
        if(p == 1)
            return 0
        else {
            flipPages++
            for (i in 1 until n)
                if (book[i] == p || book[i + 1] == p)
                    return flipPages
                else
                    flipPages++
        }
    }

    return flipPages
}