import com.knoldus.inventory.{Inventoryy, Products}
import edu.knoldus.authenticateuser.User
import edu.knoldus.checkout.Checkout
import org.scalatest.FunSuite

class Checkouttestcases  extends FunSuite {

  val operation = new Checkout

  test("Function should retrun the Map consisiting including cart details") {
    assert(operation.addToCart("9718084510", 1, Map("9718084510" -> User("bhawna", "1234", List()))) === Map("9718084510" -> User("bhawna", "1234", List(1))))
  }

  test("Function should return the Price") {
    assert(operation.buyProduct("9718084510", Map("9718084510" -> User("bhawna", "1234", List(1))), Map(1 -> Products("Addidas", "black colour", 200, 2, "Clothing"))) === 200)
  }
}


