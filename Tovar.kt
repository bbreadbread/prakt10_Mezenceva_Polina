class Tovar(name: String, price: Double, count: Int, Q: Double,
            P: Int, T: Int): Input_Output(name,price,count,Q, P ,T)
{
    override fun Input(){
        println("Введите название товара")
        name = readLine()!!
        println("Введите количество купленного товара")
        count = readLine()!!.toInt()
        println("Введите общую цену")
        price = readLine()!!.toDouble()
    }
    override fun Output(){
        println("Товар: $name")
        println("Количество: $count")
        println("Цена: $price")
        val Q = price / count
        println("Цена за единицу: $Q")
    }

    override fun Input_Years(){
        println("Введите год выпуска товара")
        P = readLine()!!.toInt()
        println("Введите текущий год")
        T = readLine()!!.toInt()
    }
    fun Output_Years(P: Int, now: Int, Q: Double){
        var Qp = Q + 0.5*( T - P )
        println("Qp = $Qp")
    }
}