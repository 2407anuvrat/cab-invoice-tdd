
data class Ride(val dist: Double, val time: Double) {

    companion object {
        val fare_per_unit_dist =  10.0
        val fare_per_unit_time = 1.0
    }
    fun calculateFare() : Double{
        return this.dist * fare_per_unit_dist + this.time * fare_per_unit_time
    }
}
