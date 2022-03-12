package PracticeAlgorithms

fun billDivision(bill: Array<Int>, k: Int, b: Int): Unit {

    var fairBill = (bill.sum() - bill[k])/2

    if(fairBill == b)
        println("Bon Appetit")
    else
        println(b - fairBill)
}