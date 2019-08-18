fun main(args: Array<String>) {
//    runSimulation("Guyal", ::printConstructionCosts) { playerName, numBuildings ->
//        val currentYear = 2018
//        println("Adding $numBuildings houses")
//        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
//    }

    runSimulation()
}

//inline fun runSimulation(playerName: String,
//                         costPrinter: (Int) -> Unit,
//                         greetingFunction: (String, Int) -> String) {
//    val numBuildings = (1..3).shuffled().last() //Randomly selects 1, 2, or 3
//    costPrinter(numBuildings)
//    println(greetingFunction(playerName, numBuildings))
//}

fun runSimulation() {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun printConstructionCosts(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospitals"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2018
        numBuildings += 1
        println("Adding $numBuildings $structureType")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}