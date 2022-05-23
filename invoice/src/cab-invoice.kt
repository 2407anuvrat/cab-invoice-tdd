class CabInvoice {

    companion object {
        val fare_per_unit_dist =  10.0
        val fare_per_unit_time = 1.0
    }

    fun fare(rides: Ride): Double {


        val (dist, time) = rides
        return dist * fare_per_unit_dist + time * fare_per_unit_time
    }
}
