import PracticeAlgorithms.divisibleSumPairs
import PracticeAlgorithms.migratoryBirds
import PracticeAlgorithms.subArrayDivision
import java.util.*

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

    println(migratoryBirds(arrayOf(4,4,3,3,5)))

}






//println(teste("4 5 6 - 7 +"))

// println(a("gui-nielsen*Ana_flavia"))

//println(b("<div>abc</div><p><em><i>test test test</b></em></p>"))

//println(stringToBinaryTree("[5, 2, 6, 1, #, 8, #]"))

fun stringToBinaryTree(str: String): Int{

    val tree = BinaryTree()

    val numbers = str.substring(1,str.length-1).split(",").map { element ->
        val e = element.trim()
        if(e != "#"){
            e.toInt()
        }else{
            null
        }
    }

    tree.insertLevelOrder(numbers.toTypedArray(), tree.root, 0)

    println(tree.findLCA(2,6))

    return 1
}

class Node(var data: Int?) {
    var left: Node?
    var right: Node? = null

    init {
        left = right
    }
}

class BinaryTree {
    //Root of the Binary Tree
    var root: Node? = null
    fun findLCA(n1: Int, n2: Int): Node? {
        return findLCA(root, n1, n2)
    }
    fun insertLevelOrder(
        arr: Array<Int?>, root: Node?,
        i: Int
    ): Node? {
        // Base case for recursion
        var root = root
        if (i < arr.size) {
            val temp = Node(arr[i])
            root = temp

            // insert left child
            root.left = insertLevelOrder(
                arr, root.left,
                2 * i + 1
            )

            // insert right child
            root.right = insertLevelOrder(
                arr, root.right,
                2 * i + 2
            )
        }
        return root
    }

    // This function returns pointer to LCA of two given
    // values n1 and n2. This function assumes that n1 and
    // n2 are present in Binary Tree
    fun findLCA(node: Node?, n1: Int, n2: Int): Node? {
        // Base case
        if (node == null) return null

        // If either n1 or n2 matches with root's key, report
        // the presence by returning root (Note that if a key is
        // ancestor of other, then the ancestor key becomes LCA
        if (node.data == n1 || node.data == n2) return node

        // Look for keys in left and right subtrees
        val left_lca = findLCA(node.left, n1, n2)
        val right_lca = findLCA(node.right, n1, n2)

        // If both of the above calls return Non-NULL, then one key
        // is present in once subtree and other is present in other,
        // So this node is the LCA
        return if (left_lca != null && right_lca != null) node else left_lca ?: right_lca

        // Otherwise check if left subtree or right subtree is LCA
    }

    companion object {
        /* Driver program to test above functions */
        @JvmStatic
        fun main(args: Array<String>) {
            val tree = BinaryTree()
            tree.root = Node(5)
            tree.root!!.left = Node(2)
            tree.root!!.right = Node(6)
            tree.root!!.left!!.left = Node(1)
            tree.root!!.right!!.left = Node(8)
            tree.root!!.right!!.right = Node(12)
            tree.root!!.right!!.right!!.left = Node(3)

            println(
                tree.findLCA(3, 12)!!.data
            )
        }
    }
}

fun b(str: String): String{

    // b, i, em, div, p
    //"<div><div><b> ola eu sou <voce> </b></div></p>"

    val stack = Stack<String>()

    for(i in str.indices){
        when{
            str[i] == '<' && listOf('b','i','p').contains(str[i+1]) && str[i+2] == '>' -> stack.push(str[i+1].toString()).also { println("PUSH $it")}
            str[i] == '<' && str[i+1] == 'e' && str[i+2] == 'm' && str[i+3] == '>' -> stack.push("em").also { println("PUSH $it")}
            str[i] == '<' && str[i+1] == 'd' && str[i+2] == 'i' && str[i+3] == 'v' && str[i+4] == '>' -> stack.push("div").also { println("PUSH $it")}

            str[i] == '<' && str[i+1] == '/' && listOf('b','i','p').contains(str[i+2]) && str[i+3] == '>' -> {
                if(stack.peek() == str[i+2].toString())
                    stack.pop().also { println("POP $it")}
                else
                    return stack.pop().also { println("POP $it")}
            }
            str[i] == '<' && str[i+1] == '/' &&  str[i+2] == 'e' && str[i+3] == 'm' && str[i+4] == '>' -> {
                if(stack.peek() == "em")
                    stack.pop().also { println("POP $it")}
                else
                    return stack.pop().also { println("POP $it")}
            }
            str[i] == '<' && str[i+1] == '/' &&  str[i+2] == 'd' && str[i+3] == 'i' && str[i+4] == 'v' && str[i+5] == '>' -> {
                if(stack.peek() == "div")
                    stack.pop().also { println("POP $it")}
                else
                    return stack.pop().also { println("POP $it")}
            }

        }
    }

    return "true"
}

fun a(str: String): String{

    return str.lowercase().split(Regex("[^a-zA-Z]")).mapIndexed { index, string ->
        if(index != 0){
            var newString = string.toCharArray()
            newString[0] = newString[0].uppercaseChar()
            newString.joinToString("")
        }else{
            string
        }
    }.joinToString("")

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