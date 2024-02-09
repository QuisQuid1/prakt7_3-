fun main(){
    try {
        println("Введите длину окружности")
        var l= readLine()!!.toDouble()
        if (l>0)
        {
            var p = 3.14
            val S=l*l/(4*p)
            println("Площадь круга $S")
        }
        else { println("Длина окружности не может быть равна 0")}
    }catch(e:Exception){
        println("Что то не то")}
}