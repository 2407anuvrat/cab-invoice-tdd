import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.shouldBe


class CabInvoiceTest : StringSpec() {
    init {
        "fare of 1 km covered in 0 min should be Rs 10" {
            val inv: CabInvoice = CabInvoice(listOf( Ride(1.0, 0.0)))
            inv.totalFare shouldBe 10.0
            inv.totalRides shouldBe 1
            inv.avgCost shouldBe 10.0
        }

        "fare of 0 km covered in 10 min should be Rs 10" {
            val inv: CabInvoice = CabInvoice(listOf( Ride(0.0, 10.0)))
            inv.totalFare shouldBe 10.0
            inv.totalRides shouldBe 1
            inv.avgCost shouldBe 10.0
        }

        "fare of 1.2 km covered in 5.5 min should be Rs 10" {
//            CabInvoice().createInvoice(listOf( Ride(1.2, 5.5))) shouldBe 17.5
            val inv: CabInvoice = CabInvoice(listOf( Ride(1.2, 5.5)))
            inv.totalFare shouldBe 17.5
            inv.totalRides shouldBe 1
            inv.avgCost shouldBe 17.5
        }

        "fare of given array of distance and time should be 12.3"{
//            CabInvoice().createInvoice(listOf( Ride(1.0, 2.3))) shouldBe 12.3
            val inv: CabInvoice = CabInvoice(listOf( Ride(1.0, 2.3)))
            inv.totalFare shouldBe 12.3
            inv.totalRides shouldBe 1
            inv.avgCost shouldBe 12.3
        }

        "fare of 2 rides object is calculated"{
//            CabInvoice().createInvoice(listOf( Ride(1.0, 0.0), Ride(2.0, 1.0), Ride(0.0, 0.0))) shouldBe 31
            val inv: CabInvoice = CabInvoice(listOf( Ride(1.0, 0.0), Ride(2.0, 3.0), Ride(0.0, 0.0)))
            inv.totalFare shouldBe 33.0
            inv.totalRides shouldBe 3
            inv.avgCost shouldBe 11.0
        }

        "fare of no ride is calculated"{
//            CabInvoice().createInvoice(listOf( )) shouldBe 0.0
            val inv: CabInvoice = CabInvoice(listOf())
            inv.totalFare shouldBe 0.0
            inv.totalRides shouldBe 0
            inv.avgCost shouldBe 0.0
        }

        "fare of multiple ride object is calculated"{
//            CabInvoice().createInvoice(listOf( Ride(1.0, 2.3), Ride(2.0, 4.9), Ride(10.0, 0.0), Ride(0.0, 20.0))) shouldBe 157.2
            val inv: CabInvoice = CabInvoice(listOf( Ride(1.0, 2.3), Ride(2.0, 4.9), Ride(10.0, 0.0), Ride(0.0, 20.0)))
            inv.totalFare shouldBe 157.2
            inv.totalRides shouldBe 4
            inv.avgCost shouldBe 39.3

        }
    }
}
