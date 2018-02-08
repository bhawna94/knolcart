package edu.knoldus.checkout

import com.knoldus.inventory.Products
import edu.knoldus.authenticateuser.{User, Userauthentication}

import scala.io.StdIn.readInt

class Checkout extends Userauthentication  {

  def addToCart(userid: String, productid: Int, userinfo: Map[String, User]): Map[String,User] = {

    val userdetail: Option[User] = userinfo.get(userid)
    val cartdetails = userdetail.get.cart ::: List(productid)
    val updateduserdetails = addingUser(userid, User(userdetail.get.name, userdetail.get.password, cartdetails),userinfo)
    updateduserdetails
  }

  def buyProduct(userid: String, userinfo: Map[String, User], productinfo: Map[Int, Products]): Int = {

    val userdetail: Option[User] = userinfo.get(userid)
    val purchasedproduct = userdetail.get.cart
    println("enter the product id")
    val productiddecidedbyuser: Int = readInt()
    val productdetails: Option[Products] = productinfo.get(productiddecidedbyuser)
    productdetails.get.price
  }

}
