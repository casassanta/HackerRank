package PracticeAlgorithms

// 256th day of the year
fun dayOfProgrammer(year: Int): String {

    val daysYear = arrayOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    var day = 0
    var month = 0
    var sum = 0
    var i = 0

    if(year < 1918){ // Julian
        if(year % 4 == 0)
            daysYear[1] = 29

    }else if(year >= 1919){  // Gregorian
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            daysYear[1] = 29
    }else{
        daysYear[1] = 15
    }

    while(sum < 256){
        sum += daysYear[i]
        i++
    }
    month = i
    day = daysYear[i-1] - (sum - 256)

    if(year == 1918 && month == 2)
        day += 14

    return if(month < 10)
        "$day.0$month.$year"
    else
        "$day.$month.$year"
}