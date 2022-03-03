package PracticeAlgorithms

fun breakingRecords(scores: Array<Int>): Array<Int> {
    // Write your code here

    var min = 0
    var max = 0
    var recordMin = 0
    var recordMax = 0

    for(i in scores.indices){
        if(i == 0){
            min = scores[i]
            max = scores[i]
        }else{
            if(scores[i] < min){
                min = scores[i]
                recordMin++
            }
            if(scores[i] > max){
                max = scores[i]
                recordMax++
            }
        }
    }

    return arrayOf(recordMax,recordMin)

}
