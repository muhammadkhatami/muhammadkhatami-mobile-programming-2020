package id.ac.ui.cs.mobileprogramming.muhammadkhatami.helloworld

import org.junit.Test
import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class HelloWorldUnitTest {
    @Test
    fun themeIsChanged() {
        val activity = MainActivity()
        assertEquals(activity.themeChanged(), "theme changed")
    }
}