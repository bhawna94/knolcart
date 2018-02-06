package com.knoldus.inventory

class Inventoryy extends Inventory {


  def addItems(productid: Int, productdetails: Products, productinfo: Map[Int,Products]): Map[Int,Products]= {

    val producttable = productinfo + (productid -> productdetails)
    producttable
  }

  def deleteItems(productid :Int, productinfo: Map[Int,Products]): Map[Int,Products] = {

    if (productinfo.contains(productid)) {
      val producttable = productinfo - productid
      producttable
    }
    else {
      printf("Following list is not in the list")
      productinfo
    }
  }

  def updateItems(productid: Int,pcount: Int, productinfo: Map[Int, Products]): Map[Int, Products] = {

    val product1:Option[Products]=productinfo.get(productid)
    if(product1.isDefined) {
      val newupdatedlist = addItems(productid,Products(product1.get.productname,product1.get.description,product1.get.price,product1.get.quantity + pcount,product1.get.category), productinfo)

      newupdatedlist
    }
    else {
      println("Product is not in the list")
      productinfo
    }
  }

  def productSearchbyCategory(productinfo: Map[Int,Products],searchcategory:String): Unit= {

    productinfo.foreach{
      case(pid,product) => if(product.category == searchcategory) println(s"$pid",s"$product")
    }
  }

  override def productView(productinfo: Map[Int,Products]):Unit = {

    productinfo.foreach{

      case(pid,product)  =>println(s"$pid",s"$product")

    }
  }




}
