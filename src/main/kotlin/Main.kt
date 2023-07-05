fun main() {
    val toyo = Car("Toyota","Prado", "KDG 118B", 0)
    val audi = Car("Audi", "A4", "KDG 290A", 0)
    audi.start()
    println(audi.speed)
    audi.accelerate(60)
    println(audi.speed)
    audi.accelerate(35)
    println(audi.speed)
    audi.deccelerate(20)
    println(audi.speed)
    toyo.deccelerate(20)
    println(toyo.speed)
    audi.hoot()
    audi.stop()

    val myBook =Book("Born a crime", "Trevor Noah", 288, 2017)
    println(myBook.title)
    println(myBook.pages)

    var car = Car("Honda", "Fit", "KDG004B", 0)

    var agesstats= AgeStats(15, 4,20.0,3.0,5.0)
    println(agecalc(Array<67>))

}
class Car(var make: String, var model: String, var registaration: String, var speed: Int){
    fun start(){
        println("Chogio gio gio, Vroooom")
    }

    fun accelerate(acceleration: Int): Int{
        speed +=acceleration
        return speed

    }
    fun deccelerate(decellaration: Int):Int{
        speed -= decellaration
        return speed
    }
    fun hoot(){
        println("Beep, beeep")
    }
    fun stop(){
        speed -= speed
        println(speed)
    }
}


data class Book(var title:String, var author: String, var pages: Int, var year: Int)

    data class AgeStats( var max: Int, var min: Int, var mean: Double, var median: Double, var average: Double)

    fun agecalc(ages: Array<Int>): AgeStats {
        var max = ages.max()
        var min = ages.min()
        var average = ages.average()

        var stats = AgeStats(max, min, average )
        return  stats

    }


