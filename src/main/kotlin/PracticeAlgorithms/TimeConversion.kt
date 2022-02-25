package PracticeAlgorithms

fun timeConversion(s: String): String {
    val dayNight = s.subSequence(s.length -2, s.length)
    val hour = s.subSequence(0,2).toString().toInt()

    return if(dayNight == "PM"){
        if (hour == 12)
            s.subSequence(0,s.length-2).toString()
        else
            hour.plus(12).toString() + s.subSequence(2,s.length-2)
    }else{
        if (hour == 12)
            "00" + s.subSequence(2,s.length-2)
        else
            s.subSequence(0,s.length-2).toString()
    }

}