package PracticeAlgorithms

fun weightedUniformStrings(s: String, queries: Array<Int>): Array<String> {
    val results = mutableListOf<String>()
    val string = s.toCharArray()
    val weightsUniform = mutableListOf<Int>()
    var weight = -1


    for(i in string.indices){
        if(weight == -1){
            weight = string[i].hashCode() - 96
            weightsUniform.add(weight)
        }else{
            if(string[i] == string[i-1]){
                weight = weight + string[i].hashCode() - 96
                weightsUniform.add(weight)
            }else{
                weight = string[i].hashCode() - 96
                weightsUniform.add(weight)
            }
        }
    }


    queries.forEach { value ->
        if(weightsUniform.contains(value))
            results.add("Yes")
        else
            results.add("No")
    }

    return results.toTypedArray()
}