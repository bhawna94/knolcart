package edu.knoldus.authenticateuser

trait Authenticateuser {

  def addingUser(phonenumber: String, person: User, userdetails: Map[String,User]):Map[String,User]
  def loginUser(phonenumber:String,userdetails: Map[String,User]): Option[Int]
}
