import PracticeAlgorithms.*
import java.util.*
import kotlin.collections.HashMap

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

    //println(subArrayDivision(arrayOf(2,2,1,3,2), 4, 2))

    //println(divisibleSumPairs(6,3,arrayOf(1,3,2,6,1,2)))

    //println(migratoryBirds(arrayOf(4,4,3,3,5)))

    // billDivision(arrayOf(4,6,10), 1, 7)

    //println(salesByMatch(9, arrayOf(10,20,20,10,10,30,50,10,20)))

    //println(drawingBook(5,4)) - NOT FINISHED

    //println(catAndMouse(1,3,2))

    //println(eletronicsShop(arrayOf(3,1), arrayOf(5,2,8), 10))

    //println(pickingNumbers(arrayOf(4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4 ,5 ,97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4 ,97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4, 97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4, 97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 9)))

    //println(theHurdleRace(4, arrayOf(1,6,3,5,2)))

    //println(designerPDFViewer(arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5), "abc"))

    println(utopianTree(5))
}


fun solution2(a: MutableList<Int>): MutableList<Int> {
    val result = mutableListOf<Int>()
    var stringNumbers = ""
    var mapDigits = HashMap<Int, Int>()
    var maxAppear = 0

    a.map { element ->
        stringNumbers += element.toString()
    }

    for(i in stringNumbers.indices){
        mapDigits.compute(stringNumbers[i].digitToInt()) { _, value ->
            if (value != null) value + 1 else 1
        }
    }

    maxAppear = mapDigits.maxOf { map ->
        map.value
    }

    mapDigits.forEach { map ->
        if(map.value == maxAppear)
            result.add(map.key)
    }

    return result.sorted().toMutableList()
}

fun solution1(numbers: MutableList<Int>): MutableList<Int> {
    var result = mutableListOf<Int>()
    for(i in 0 .. numbers.size -3){
        if((numbers[i] > numbers[i+1] && numbers[i+1] < numbers[i+2]) || (numbers[i] < numbers[i+1] && numbers[i+1] > numbers[i+2]))
            result.add(1)
        else
            result.add(0)
    }

    return result
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