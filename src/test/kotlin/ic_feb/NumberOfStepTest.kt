package ic_feb

import org.junit.Assert
import org.junit.Before
import org.junit.Test


class NumberOfStepTest {
    private lateinit var obj: NumberOfStep

    @Before
    fun setup() {
        obj = NumberOfStep()
    }

    @Test
    fun numberOfSteps() {
        Assert.assertEquals(6, obj.numberOfSteps(14))
        Assert.assertEquals(4, obj.numberOfSteps(8))
        Assert.assertEquals(12, obj.numberOfSteps(123))
    }

    @Test
    fun numberOfStepsOptimal() {
        Assert.assertEquals(6, obj.numberOfStepsOptimal(14))
        Assert.assertEquals(4, obj.numberOfStepsOptimal(8))
        Assert.assertEquals(12, obj.numberOfStepsOptimal(123))
    }
}