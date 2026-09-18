package com.example.zsaghir_decision_making_app

abstract class Probability(var name : String ) {
    abstract fun choice () : String
    abstract fun behaviour(): String
}

class Button1Probability(name: String,) : Probability(name) {
    override fun choice() : String {return name}
    override fun behaviour() : String {
        val randomNumber = (1..100).random()
        if (randomNumber <= 30) {
            return "Yes"
        }
        return "No"
    }
}
class Button2Probability(name: String,) : Probability(name) {
    override fun choice() : String {return name}
    override fun behaviour() : String {
        val randomNumber = (1..100).random()
        if (randomNumber <= 20) {
            return "Yes"
        }
        return "No"
    }
}
class Button3Probability(name: String,) : Probability(name) {
    override fun choice() : String {return name}
    override fun behaviour() : String {
        val randomNumber = (1..100).random()
        if (randomNumber <= 50) {
            return "Yes"
        }
        return "No"
    }
}

