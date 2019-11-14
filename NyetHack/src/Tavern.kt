const val TAVERN_NAME = "Taernyl's Folly"

fun main(args: Array<String>) {
//    var beverage = readLine()?.let {
//        if (it.isNotBlank()) {
//            it.capitalize()
//        } else {
//            "Buttered Ale"
//        }
//    }
//    var beverage = readLine()!!.capitalize()

    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can't do that without crashing - beverage is null!")
    }
//    beverage = null
    println(beverage)

    val beverageServed: String = beverage ?: "Buttered Ale"
    println(beverageServed)

    placeOrder("shandy,Dragon's Breath,5.91")

    placeOrder("elixir,Shirley's Temple,4.12")
}

private fun placeOrder(menuData: String) {
    val indexOfApostrophe = TAVERN_NAME.indexOf('\'')
    val tavernMaster = TAVERN_NAME.substring(0 until indexOfApostrophe)
    println("Madrigal speaks with $tavernMaster about their order.")
//    val data = menuData.split(',')
//    val type = data[0]
//    val name = data[1]
//    val price = data[2]
    val (type, name, price) = menuData.split(',')
    val message = "Madrigal buys a $name ($type) for $price"
    println(message)

//    val phrase = "Ah, delicious $name"
//    println("Madrigal exclaims: ${toDragonSpeak(phrase)}")

    val phrase = if (name == "Dragon's Breath") {
        "Madrigal exclaims: ${toDragonSpeak("Ah, delicious $name")}"
    } else {
        "Madrigal says: Thank's for the $name"
    }
    println(phrase)
}

private fun toDragonSpeak(phrase: String) =
    phrase.replace(Regex("[aeiouAEIOU]")) {
        when (it.value.toLowerCase()) {
            "a" -> "4"
            "e" -> "3"
            "i" -> "1"
            "0" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
    }
