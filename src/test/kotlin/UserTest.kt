import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class UserTest {

    val user = User(1, "Bob")

    @Test
    fun shouldBeAbleToIncreaseReputation() {
        user.changeReputation(10)
        Assertions.assertEquals(10, user.reputation)
    }
}