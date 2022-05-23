import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class CabInvoiceTest : StringSpec() {
    init {
        "fare of 1 km covered in 0 min should be Rs 10" {
            CabInvoice().fare(listOf( Ride(1.0, 0.0))) shouldBe 10.0
        }

        "fare of 0 km covered in 10 min should be Rs 10" {
            CabInvoice().fare(listOf( Ride(0.0, 10.0))) shouldBe 10.0
        }

        "fare of 1.2 km covered in 5.5 min should be Rs 10" {
            CabInvoice().fare(listOf( Ride(1.2, 5.5))) shouldBe 17.5
        }

        "fare of given array of distance and time should be 12.3"{
            CabInvoice().fare(listOf( Ride(1.0, 2.3))) shouldBe 12.3
        }

        "fare of multiple ride object is implemented"{
            CabInvoice().fare(listOf( Ride(1.0, 2.3), Ride(2.0, 4.9), Ride(10.0, 0.0), Ride(0.0, 20.0))) shouldBe 157.2
        }
    }
}
