import Tovar
import java.lang.Exception

fun main(){
    try {
        var tovar = Tovar("",0.0,0,0.0, 0,0)
        tovar.Input()
        tovar.Input_Years()
        tovar.Output()
        tovar.Output_Years(tovar.P,tovar.T, tovar.Q)
    }
    catch (e:Exception){
        println("Ошибка")
    }
}