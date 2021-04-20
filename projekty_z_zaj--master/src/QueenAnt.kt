class QueenAnt(
    capacity: Int = 4,
    speed: Int = 2,
    age: Int = 10,
    var ruleYearsLeft: Int = 5,
    var ruleEnded: Boolean = false
):Ant(4,2,10, 400, 50) {
    fun checkRuleYearsLeft() = when{
        ruleYearsLeft == 1 -> println("został już tylko rok panowania")
        ruleYearsLeft< 1-> println("Zakończyła panowanie")
        else -> println("Zostało jeszcze $ruleYearsLeft lat panowania")
    }
}