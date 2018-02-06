import com.knoldus.inventory.{Inventoryy, Products}
import org.scalatest.FunSuite

class Inventorytestcases extends FunSuite {

  val operation = new Inventoryy

  test("Function should retrun the Map consisiting product details"){
    assert(operation.addItems(1,Products("Addidas","black colour",200,2,"Clothing"),Map()) === Map(1->Products("Addidas","black colour",200,2,"Clothing")))
  }

  test("Function should return the empty list"){
    assert(operation.deleteItems(1,Map(1->Products("Addidas","black colour",200,2,"Clothing"))) === Map())
  }

 test("Function should update the map"){
   assert(operation.updateItems(1,3,Map(1->Products("Addidas","black colour",200,2,"Clothing"))) === Map(1->Products("Addidas","black colour",200,5,"Clothing")))
 }

}
