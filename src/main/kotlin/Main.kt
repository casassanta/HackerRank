import PracticeAlgorithms.*
import java.util.Stack

fun main(args: Array<String>) {

    // println(solveMeFirst(5,6))   //#1

    // println(simpleArraySum(Array(2) { it+1 })) //#2

    // val result3 = compareTriplets(arrayOf(5,6,7), arrayOf(3,6,10))  //#3
    // println("Alice = ${result3[0]} - Bob = ${result3[1]}")          //#3

    // println(aVeryBigSum(arrayOf(1000000001, 1000000002, 1000000003, 1000000004, 1000000005)))  //#4

    // println(diagonalDifferences(arrayOf(arrayOf(11,2,4), arrayOf(4,5,6), arrayOf(10,8,-12))))  //#5

    // plusMinus(arrayOf(-4, 3, -9, 0, 4, 1)) // #6

    // stairCase(5) // #7

    // println(birthdayCakeCandles(arrayOf(3,2,1,3))) // #8

    // println(timeConversion("07:05:45PM"))  // #9

    //val grades = gradingStudents(arrayOf(73,67,38,33))   // #10
    //grades.map{ println(it) }                            // #10

    // countApplesAndOranges(7,11,5,15,arrayOf(-2,2,1), arrayOf(5,-6)) // #11

    // formingMagicSquare(arrayOf(arrayOf(8,3,4), arrayOf(1,5,9), arrayOf(6,7,2)))  // #Special Extra to be finished

    // println(numbersLinesJump(4,1,4,2)) // #12

    //println(testando(arrayOf(1, 3, 6, 4, 1, 2).toIntArray()))

    // println(dayOfProgrammer(1918))

    //println(betweenTwoSets(arrayOf(2,4), arrayOf(16,32,96)))

    //var breakingRecords = breakingRecords(arrayOf(10, 5, 20, 20, 4, 5, 2, 25, 1))
    //println("${breakingRecords[0]} - ${breakingRecords[1]}")

    //extraLongFactorials(25)


    //println(teste("4 5 6 - 7 +"))


}

fun teste2(S: String): Int{

    var numberArray: CharArray
    var divisible = mutableSetOf<Int>()
    var number: Int

    S.toCharArray().forEachIndexed { index,char ->
        numberArray = S.toCharArray()

        for(i in 0..9){
            numberArray[index] = i.digitToChar()
            number = String(numberArray).toInt()

            if (number % 3 == 0) {
                divisible.add(number)
            }
        }
    }

    return divisible.count()
}

fun teste(s: String): Int{

    var stack = Stack<Int>()
    val max = 1048575


    s.split(' ').map{ substring ->

        if(Regex("\\d").matches(substring[0].toString())) {
            val number = substring.toInt()
            if(number > max)
                return -1
            else
                stack.push(number)
        } else if(substring == "POP")  {
            if(stack.isEmpty())
                return -1
            else
                stack.pop()
        }
        else if(substring == "DUP") {
            if(stack.isEmpty())
                return -1
            else
                stack.push(stack.peek())
        }
        else if(substring == "+") {
            if(stack.size < 2)
                return -1
            else{
                val number1 = stack.pop()
                val number2 = stack.pop()
                val result = number1 + number2

                if(result > max)
                    return -1
                else
                    stack.push(number1 + number2)
            }
        }
        else if(substring == "-") {
            if(stack.size < 2)
                return -1
            else{
                val number1 = stack.pop()
                val number2 = stack.pop()
                val result = number1 - number2

                if(result < 0)
                    return -1
                else
                    stack.push(number1 - number2)
            }
        }
        else return -1
    }

    return stack.pop()
}