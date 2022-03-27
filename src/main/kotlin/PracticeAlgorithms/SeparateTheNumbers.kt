package PracticeAlgorithms

fun separateTheNumbers(s: String): Unit {

    var result = ""

    s.split("\n").map { string ->
        val numberArray = string.toCharArray()
        val numberSize = numberArray.size
        var isSequence = true
        var isLong = 0

        println("-> ${string}")

        for (i in 0 until numberSize / 2) {

            var substring = string.substring(0, i + 1)
            var number = substring.toInt()
            isSequence = true

            if((number + 1).toString().length > substring.length)
                isLong = 1

            for (j in i + 1 until numberSize step i + 1 + isLong) {
                var nextNumber = string.substring(j, j + i + 1 + isLong).toInt()

                if (nextNumber != number + 1) {
                    isSequence = false
                    println("--> number = $number and is next $nextNumber ? No")
                } else {
                    println("--> number = $number and is next $nextNumber ? Yes")
                    number = nextNumber
                }
            }

            if (isSequence) {
                println("verdade")
                result += "YES ${string.substring(0, i + 1).toInt()}\n"
                break
            }
        }

        if(!isSequence)
            result += "NO\n"
    }
    result = result.substring(0, result.length-1)
    println(result)
}

