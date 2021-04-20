enum class Tasks(val order: String) {
    BUILDING(Orders.BUILD.name),
    COLLECTING(Orders.COLLECT.name),
    ATTACKING(Orders.ATTACK.name),
    DEFENDING(Orders.DEFEND.name),
    NOTHING(Orders.NOTHING.name);

    companion object{
        //zmienna z () a w {} można dodać warunek
        fun getByOrder(order : String) = values().firstOrNull { task ->
            task.order == order
        }
    }
}