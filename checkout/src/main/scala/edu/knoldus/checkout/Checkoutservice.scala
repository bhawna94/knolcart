package edu.knoldus.checkout

import com.knoldus.inventory.Products
import edu.knoldus.authenticateuser.{Authenticateuser, User, Userauthentication}

import scala.io.StdIn.readInt

trait Checkoutservice  {


  def addToCart(userid: String, productid: Int, userinfo: Map[String, User], productinfo: Map[Int, Products]):Map[String,User]
  def buyProduct(userid: String, userinfo: Map[String, User], productinfo: Map[Int, Products]): Int

}









