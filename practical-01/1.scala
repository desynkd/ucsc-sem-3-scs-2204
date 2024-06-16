object findArea {
    val pi: Double = 3.1415

    def areaOfDisk(radius: Double): Double = {
        pi * radius * radius
    }

    def main(args: Array[String]): Unit = {
        val radius = 5
        printf(" Area of disk of radius %d = %f\n", radius, areaOfDisk(radius))
  }

}