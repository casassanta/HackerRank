package PracticeAlgorithms

fun gradingStudents(grades: Array<Int>): Array<Int> {

    val newGrades = ArrayList<Int>()

    grades.map{ grade ->
        if (grade >= 38)
                if((grade + 2) % 5 == 0)
                        newGrades.add(grade+2)
                else if ((grade + 1) % 5 == 0)
                        newGrades.add(grade+1)
                else
                    newGrades.add(grade)
        else
            newGrades.add(grade)
    }

    return newGrades.toTypedArray()
}