package PracticeAlgorithms

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CamelCaseKtTest{


    @Test
    fun `should return the number of words properly`(){
        val string = "guilhermeCastilho"

        val results = camelcase(string)

        assertEquals(2, results)
    }

}