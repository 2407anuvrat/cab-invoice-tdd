class CabInvoice(rides: List<Ride>) {

    val totalFare: Double = rides.sumOf { it.calculateFare() }
    val totalRides: Int = rides.size
    val avgCost = if (totalRides == 0) 0.0 else totalFare/totalRides

}
