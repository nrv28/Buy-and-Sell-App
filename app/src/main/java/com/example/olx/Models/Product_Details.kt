package com.example.olx.Models

class Product_Details {
    var item_name:String?=null
    var item_price:String?=null
    var item_contact:String?=null
    constructor()

    constructor(item_name: String?,item_price:String?,item_contact:String?){
        this.item_name=item_name
        this.item_price=item_price
        this.item_contact=item_contact
    }

    companion object
}