fun main(){
    val nikusutaHiyashi:Ramen = Ramen("うまい", "ﾁｮｯﾄﾀｶｲ", "満足/多い")
    nikusutaHiyashi.detail()
}

class Ramen(taste: String, price: String, volume: String){
    private var taste: String = taste
    private var price: String = price
    private var volume: String = volume
    fun detail(){
        println(taste)
        println(price)
        println(volume)
    }
}

