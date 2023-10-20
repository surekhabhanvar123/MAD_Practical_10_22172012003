package com.example.mad_practical_10_22172012003

import java.io.Serializable
import java.net.Inet4Address

class Person(var id:String,
             var name: String,
             var emailId:String,
             var phoneNo:String,
             var address:String,
             var latitude:Double,
             var longitude:Double):Serializable {
}