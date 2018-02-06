package com.knoldus.inventory

trait Inventory {

  def addItems(productid: Int, productdetails: Products, productinfo: Map[Int,Products]): Map[Int, Products]
  def deleteItems(productid :Int, productinfo: Map[Int,Products]): Map[Int, Products]
  def updateItems(productid: Int,pcount: Int, productinfo: Map[Int, Products]): Map[Int, Products]
  def productSearchbyCategory(productinfo: Map[Int,Products],searchcategory:String):Unit
  def productView(productinfo: Map[Int,Products]):Unit
}



