package PracticeAlgorithms

fun hackerRankInAString(s: String): String {
    val hackerRank = "hackerrank".toCharArray()
    var filteredString = s.lowercase().filter { char -> hackerRank.contains(char) }

    if(filteredString.length < hackerRank.size)
        return "NO"

    for(i in hackerRank.indices){
        val index = filteredString.indexOfFirst { char -> char == hackerRank[i] }
        if(index != -1){
            filteredString = filteredString.substring(index+1)
        }else{
            return "NO"
        }
    }

    return "YES"
}