package lc_mar

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class ShortEncodingWordsTest {
    private lateinit var obj: ShortEncodingWords

    @Before
    fun setup() {
        obj = ShortEncodingWords()
    }

    @Test
    fun test_minimumLengthEncoding() {
        Assert.assertEquals(10, obj.minimumLengthEncoding(arrayOf("time", "me", "bell")))
        Assert.assertEquals(2, obj.minimumLengthEncoding(arrayOf("t")))
        Assert.assertEquals(5, obj.minimumLengthEncoding(arrayOf("me", "time")))
    }
}