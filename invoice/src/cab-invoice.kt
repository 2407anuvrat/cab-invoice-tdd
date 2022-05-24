class CabInvoice {

    fun fare(rides: List<Ride>): Double {
        return rides.sumOf { it.calculateFare() }
    }
}
