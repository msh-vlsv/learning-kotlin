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
}