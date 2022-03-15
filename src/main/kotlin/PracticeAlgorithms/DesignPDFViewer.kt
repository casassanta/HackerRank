package PracticeAlgorithms

fun designerPDFViewer(h: Array<Int>, word: String): Int {

    val wordHeights = ArrayList<Int>()

    word.map { letter ->
        wordHeights.add(h[letter.hashCode() - 97])
    }

    return wordHeights.sorted().last()*wordHeights.size
}