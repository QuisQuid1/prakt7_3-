fun main(){
    try {
        println("Введите внутренний радиус")
        var r= readLine()!!.toDouble()
        println("Введите внешний радиус")
        var R= readLine()!!.toDouble()
        var p= 3.14
        when
        {
            (r<R&&r>0&&R>0)-> println("Площадь кольца S=${p*(R*R)-(r*r)}")
            else -> println("Что то не удовлетворяет условию")
        }
    }catch (e:Exception){
        println("Что то не то")}
}