object calculateTime {

    def easyPace(dist: Double): Double = {
        dist * 8.0
    }

    def tempo(dist: Double): Double = {
        dist * 7.0
    }

    def main(args: Array[String]): Unit = {
        val total = easyPace(2) + tempo(3) + easyPace(2) 
    
        printf("Total running time = %.2f\n", total)
    }
}