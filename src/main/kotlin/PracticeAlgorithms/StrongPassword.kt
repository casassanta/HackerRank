package PracticeAlgorithms

fun strongPassword(n: Int, password: String): Int{
    val minimumPasswordSize = 6
    var addDigits = 0

    if(!password.contains(Regex("[0-9]")))
        addDigits++

    if(!password.contains(Regex("[a-z]")))
        addDigits++

    if(!password.contains(Regex("[A-Z]")))
        addDigits++

    if(!password.contains(Regex("[!@#\$%^&*()\\-+]")))
        addDigits++

    val newPasswordSize = password.length + addDigits
    if(newPasswordSize < minimumPasswordSize) {
        addDigits += minimumPasswordSize - newPasswordSize
    }

    return addDigits
}