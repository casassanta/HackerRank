package PracticeAlgorithms

fun sherlockAndTheValidString(s: String): String {

    val mapCharacters = s.groupBy { char -> char }.map { map -> map.value.size }
    val min = mapCharacters.sorted().first()
    val max = mapCharacters.sorted().last()

    println(mapCharacters)

    if(mapCharacters.distinct().size == 1)
        return "YES"

    var copy = mapCharacters.map{it}.toMutableList()
    copy[mapCharacters.indexOf(max)] = max - 1
    if(copy.distinct().size == 1)
        return "YES"

    copy = mapCharacters.map{it}.toMutableList()
    copy[mapCharacters.indexOf(min)] = min - 1
    if(copy.filter { it != 0 }.distinct().size == 1)
        return "YES"

    return "NO"
}