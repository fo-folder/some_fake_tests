import kotlin.test.Test
import kotlin.test.assertEquals

import org.junit.jupiter.api.Assertions.*

internal class SampleTest_0 {

    private val testSample: Sample = Sample()

    @Test
    fun sum() {
        val expected = 42
        assertEquals(expected, testSample.sum(40, 2))
    }

}