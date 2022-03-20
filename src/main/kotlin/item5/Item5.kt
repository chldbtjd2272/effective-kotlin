package item5

class Item5 {
    var isInitialized: Boolean = false
    fun factorial(n: Int): Long{
        require(n >= 0 )
        return if (n <=1) 1 else factorial(n -1) * n
    }

    fun speak(text:String){
        check(isInitialized)
        //...
    }

    fun sendMail(email: String?,text:String){
        val email: String =  email ?: kotlin.run {
            println("잘못된 이메일 - $text")
            return
        }
    }

}

