import com.knoldus.inventory.{Inventoryy, Products}
import edu.knoldus.authenticateuser.{User, Userauthentication}

import org.scalatest.FunSuite

class Usertestcases extends FunSuite {


  val operation = new Userauthentication

  test("Function should retrun the Map consisiting user details"){
    assert(operation.addingUser("9718084510",User("bhawna","1234",List()),Map()) === Map("9718084510" -> User("bhawna","1234",List())))
  }

  /*test("Function should throw an exception") {
    intercept[ArithmeticException] {
      operation.loginUser("9718084510", Map("9718084810" -> User("bhawna", "1234", List())))
    }
  }*/
}
