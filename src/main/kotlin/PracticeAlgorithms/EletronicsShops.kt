package PracticeAlgorithms

fun eletronicsShop(keyboards: Array<Int>, drives: Array<Int>, b: Int): Int {

    val keyboardPrices = keyboards.sortedDescending()
    val drivePrices = drives.sortedDescending()
    var budgetUsed = arrayListOf<Int>()

    for(i in keyboardPrices.indices)
        for(j in drivePrices.indices)
            if(keyboardPrices[i] + drivePrices[j] <= b)
                budgetUsed.add(keyboardPrices[i] + drivePrices[j])

    //return budgetUsed.maxOrNull() ?: -1

    // Due to Hackerrank kotlin version:
    if(budgetUsed.isEmpty())
        return -1
    return budgetUsed.sorted().last()
}