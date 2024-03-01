abstract class Input_Output(override var name: String,
                            override var price: Double,
                            override var count:Int,
                            override var Q:Double,
                            override var P: Int,
                            override var T: Int):All
{
    abstract fun Input()
    abstract fun Output()
    abstract fun Input_Years()
}