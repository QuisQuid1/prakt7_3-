fun main(){
    try{
        println("Введите координаты первой вершины")
        var x1= readLine()!!.toDouble()
        var y1= readLine()!!.toDouble()
        println("Введите координаты второй вершины")
        var x2= readLine()!!.toDouble()
        var y2= readLine()!!.toDouble()
        println("Введите координаты третьей вершины")
        var x3= readLine()!!.toDouble()
        var y3= readLine()!!.toDouble()
        val S=0.5*(Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1)))
        val AB=Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)))
        val BC=Math.sqrt(((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2)))
        val AC=Math.sqrt(((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1)))
        val P=AB+BC+AC
        println("Площадь $S, периметр $P")
    }catch (e:Exception){println("Что то не то")}
}