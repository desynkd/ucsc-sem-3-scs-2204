object question {
    def main(args: Array[String]): Unit = {
        var k, i, j = 2
        var m, n = 5
        var f = 12.0f
        var g = 4.0f
        var c = 'X'
        var tmp: Any = null

        tmp = k + 12 * m
        println("a) " + tmp)

        tmp = m / j
        println("b) " + tmp)

        tmp = n % j
        println("c) " + tmp)

        tmp = m / j * j
        println("d) " + tmp)

        tmp = f + 10*5 + g
        println("e) " + tmp)

        // because scala does not have pre increment operators
        i += 1
        tmp = (i) * n
        println("f) " + tmp)
    }
}