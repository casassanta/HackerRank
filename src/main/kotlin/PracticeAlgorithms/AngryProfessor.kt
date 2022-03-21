package PracticeAlgorithms

fun angryProfessor(k: Int, a: Array<Int>): String {
    val arrivedStudents = a.filter { it <= 0 }.count()

    return if(arrivedStudents >= k)
        "NO"
    else
        "YES"
}