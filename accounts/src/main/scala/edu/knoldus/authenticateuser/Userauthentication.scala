package edu.knoldus.authenticateuser

import scala.util.Random

class Userauthentication extends Authenticateuser   {

  def addingUser(phonenumber: String, person: User, userdetails: Map[String,User]): Map[String,User] = {

    val userinfo = userdetails + (phonenumber-> person)
    userinfo
  }



  def loginUser(phonenumber:String,userdetails: Map[String,User]): Option[Int] = {

    val checkinguser: Option[User] = userdetails.get(phonenumber)
    if(checkinguser.isDefined) {
      val accesstoken = Random.nextInt(1000)
      //val accestokenlist = List(accesstoken)
      Some(accesstoken)
    }
    else
      None
  }


}
