package PracticeAlgorithms

fun testando(A: IntArray): Int{

  val aCopy = A.filter { it > 0 }.sorted()
  var min = 1

  if(aCopy.isEmpty())
    return min

  aCopy.map() { element ->
    if(element == min)
      min += 1
  }

  return min
}



