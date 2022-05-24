class CabInvoice {

    companion object {
        val fare_per_unit_dist =  10.0
        val fare_per_unit_time = 1.0
    }

    fun fare(rides: List<Ride>): Double {

        return rides.sumOf { it.dist*fare_per_unit_dist + it.time*fare_per_unit_time }

    }
}
