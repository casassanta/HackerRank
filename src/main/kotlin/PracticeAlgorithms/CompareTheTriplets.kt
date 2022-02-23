package PracticeAlgorithms

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    val hashPoints = HashMap<String, Int>()
    hashPoints["Alice"] = 0
    hashPoints["Bob"] = 0

    for ( (index, alice) in a.withIndex() ){
        if(alice > b[index]){
            hashPoints.compute("Alice") { _, value ->
                if (value != null) value + 1 else 1
            }
        }else if (alice < b[index]){
            hashPoints.compute("Bob") { _, value ->
                if (value != null) value + 1 else 1
            }
        }
    }

    return arrayOf(hashPoints.getValue("Alice"), hashPoints.getValue("Bob"))
}