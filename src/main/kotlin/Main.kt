    fun main(args: Array<String>) {

        print("Digite um valor para calcularmos sua tabuada: ")
        var num = readLine()!!.toInt()

        for (i in 1..10){

            println("$num X $i = ${num * i}")
        }

        println("E a tabuada invertida é: \n\n ")

        for (i in 10 downTo 1) {

            println("$num X $i = ${num * i}")
        }
    }