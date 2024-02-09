fun main(){
    try {
        println("Введите k")
        var k= readLine()!!.toDouble()
        println("Введите b")
        var b= readLine()!!.toDouble()
        println("Введите a")
        var a= readLine()!!.toDouble()
        println("прямая")
        var x1=-b/k
        var y1=k*x1+b
        println("точки пересечения $x1:$y1")
    }catch (e:Exception){
        println("Что то не то")}
}