object findVolume {
    val pi: Double = 3.14

    def volumeOfSphere(r: Double): Double = {
        (4.0 / 3.0) * pi * r * r * r
    }

    def main (args: Array[String]): Unit = {
        var radius: Double = 5
        printf("Volume of sphere with radius %.2f = %.2f\n", radius, volumeOfSphere(radius))
    }
}