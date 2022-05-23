import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe


class CabInvoiceTest : StringSpec() {
    init {
        "fare of 1 km covered in 0 min should be Rs 10" {
            CabInvoice().fare(1.0, 0.0) shouldBe 10.0
        }

        "fare of 0 km covered in 10 min should be Rs 10" {
            CabInvoice().fare(0.0, 10.0) shouldBe 10.0
        }

        "fare of 1.2 km covered in 5.5 min should be Rs 10" {
            CabInvoice().fare(1.2, 5.5) shouldBe 17.5
        }
    }
}
