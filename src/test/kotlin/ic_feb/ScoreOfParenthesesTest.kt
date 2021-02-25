package ic_feb

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class ScoreOfParenthesesTest {
    private lateinit var obj: ScoreOfParentheses

    @Before
    fun setup() {
        obj = ScoreOfParentheses()
    }

    @Test
    fun testLogic() {
        Assert.assertEquals(1, obj.scoreOfParentheses("()"))
        Assert.assertEquals(2, obj.scoreOfParentheses("()()"))
        Assert.assertEquals(2, obj.scoreOfParentheses("(())"))
        Assert.assertEquals(6, obj.scoreOfParentheses("(()(()))"))
    }
}