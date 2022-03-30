package item8

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.properties.Delegates

internal class Item8Test {

    @Test
    internal fun name() {
        val data = LateInitData()
        data.init("")
        assert(data.text == "")
    }

    @Test
    internal fun name2() {
        val data = DelegateLateInitData()
        data.init("~")
        assert(data.text == "~")
    }


}

class LateInitData {
     lateinit var text: String

    fun init(text:String){
        this.text = text
    }
}

class DelegateLateInitData {
    var text: String by Delegates.notNull()

    fun init(text:String){
        this.text = text
    }
}

