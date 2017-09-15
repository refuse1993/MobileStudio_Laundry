package com.example.kim.mobilestudio_laundry

/**
 * Created by melon on 2017-09-15.
 */
class Ordered() {
    var date:String = " "
    var name:String = " "
    var address:String = " "
    constructor(date:String, laundry:String, address:String, state:Int) : this() {
        this.date = date
        this.name = laundry
        this.address = address
    }

    fun toMap(): Map<String, Any>  {
        var result : HashMap<String, Any> = HashMap<String, Any>()
        result.put("date",date)
        result.put("name",name)
        result.put("address",address)
        return result
    }
}