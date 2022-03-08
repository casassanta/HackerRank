package PracticeAlgorithms

fun migratoryBirds(arr: Array<Int>): Int {

    val group = arr.groupBy { element -> element }
    //val biggestGroupSize = group.maxOf { map -> map.value.size }
    //val biggestBirdsGroups = group.filter { map -> map.value.size == biggestGroupSize }
    //return biggestBirdsGroups.minOf { map -> map.key }

    var biggestGroupSize = 0
    group.map { map ->
        if(map.value.size > biggestGroupSize)
            biggestGroupSize = map.value.size
    }

    var biggestBirdsType = arr.sorted()[arr.size-1]
    group.map { map ->
        if(map.value.size == biggestGroupSize)
            if(map.key < biggestBirdsType)
                biggestBirdsType = map.key
    }

    return biggestBirdsType

}