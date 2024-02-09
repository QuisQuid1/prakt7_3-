fun main(){
    try {
        println("Введите x")
        var x= readLine()!!.toDouble()
        println("Введите y")
        var y= readLine()!!.toDouble()
        println("Введите z")
        var z= readLine()!!.toDouble()
        var min=Double.MAX_VALUE
        var max=Double.MIN_VALUE
        if(x<z)
        {
            if(x>y)
            {
                max=x
            }
            else
            {
                max=y
            }
            println("U=$max")
        }
        if(x>=z)
        {
            if(x<y)
            {
                min=x
            }
            else
            {
                min=y
            }
            println("U=$min")
        }
    }catch (e:Exception){println("Что то не то")}
}