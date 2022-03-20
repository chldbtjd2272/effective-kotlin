package item4

interface CarFactory {
    fun produce() =  DEFAULT_CAR
}

open class CAR
class GV70 : CAR()
val DEFAULT_CAR = GV70()