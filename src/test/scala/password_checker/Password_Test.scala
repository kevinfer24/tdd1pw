package password_checker
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should._
import org.scalactic.Pass
import scala.compiletime.ops.long
class Password_Test extends AnyFunSpec with Matchers {
  describe("A password checker") {
    describe("determines proper length") {
      it("rejects passwords that are less than 6 characters") {
        val tooShort = "abcde"
        val longEnough = "abcdef"
        val evenLonger = "abcdefghi"
        val longEnoughWithDigits = "abcdefghi123"
        Password.isValid(tooShort) shouldBe false
        Password.isValid(longEnough) shouldBe false
        Password.isValid(evenLonger) shouldBe false
        Password.isValid(longEnoughWithDigits) shouldBe true
      }
    }
  }
}
