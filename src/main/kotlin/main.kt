package com.practice

fun main(){
    val data = RamenData()
    data.create()
    for (detail in data.ramenList){
        println("名前: ${detail.name}")
    }
}

data class Ramen(var name:String, var taste: String,var price: String,var volume: String)

class RamenData{
    var ramenList = mutableListOf<Ramen>()
    fun create(){
        val name: String = getText("ラーメンの名前は?")
        val taste: String = getText("味は?")
        val price: String = getText("値段は?")
        val volume: String = getText("量は?")
        ramenList.add(Ramen(name, taste, price, volume))
    }
    private fun getText(showText: String? = null):String{
        print("$showText \n>>>")
        return readLine().let { if(it.isNullOrBlank()) getText() else it }
    }
}
