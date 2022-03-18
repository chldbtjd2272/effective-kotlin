import org.junit.jupiter.api.Test
import kotlin.properties.Delegates

internal class MainKtTest {

    @Test
    internal fun `읽기전용 프로퍼티 게터`() {
        val person = Person("cys", "seoul")

        person.name = "ysc"
        person.address = "busan"
        assert(person.information == "ysc busan")
    }

    @Test
    internal fun name() {
        val list1: MutableList<Int> = mutableListOf()
        var list2: List<Int> = listOf()

        list1 += 1
        list2 = list2.plus(1)
        print(list2)
    }

    @Test
    internal fun name2() {
        var count = 0
        var names by Delegates.observable(listOf<String>()){_,old,new ->
            print("$old - $new")
            count++
        }

        names += "Fabio"
        names += "Bill"
        assert(count == 2)
    }
}

data class Person(
    var name: String,
    var address: String
) {
    val information: String
        get() = "$name $address"
}