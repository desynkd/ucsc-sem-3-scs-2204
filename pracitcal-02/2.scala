object question {
    def main(args: Array[String]): Unit = {
        var (a, b, c, d) = (2, 3, 4, 5)
        var k = 4.3f

        //  Java : println( - -b * a + c *d - -);
        b -= 1
        println(b * a + c * d)
        d -= 1

        // Java : println(a++);
        println(a)
        a += 1

        // Java : println (–2 * ( g – k ) +c);
        // println (-2 * ( g - k ) + c) 
        // g is not defined

        // Java : println (c=c++);
        c += 1
        println (c);
        
        // Java : println (c=++c*a++);
        c += 1
        c = c * a
        a += 1
        println(c)
    }
}