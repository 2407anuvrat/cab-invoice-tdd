class CabInvoice {

    companion object {
        val fare_per_unit_dist =  10.0
        val fare_per_unit_time = 1.0
    }

    fun fare(rides: List<Ride>): Double {

        var dist: Double = 0.0
        var time: Double = 0.0
        for (ride in rides){
            dist += ride.dist
            time += ride.time
        }
        return dist * fare_per_unit_dist + time * fare_per_unit_time
    }
}
