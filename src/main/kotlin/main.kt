fun main(){
    val nikusutaHiyashi = Ramen("うまい", "ﾁｮｯﾄﾀｶｲ", "満足/多い")
    nikusutaHiyashi.detail()
}

class Ramen(private var taste: String, private var price: String, private var volume: String){
    fun detail(){
        println(taste)
        println(price)
        println(volume)
    }
}

