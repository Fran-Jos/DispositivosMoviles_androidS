package com.uce.fjchanataxi.p.entities.repository

import com.uce.fjchanataxi.p.entities.Users

class DBUsers{

    fun getListUsers(): List<Users>{
        var us1 = Users(1,"nayeli","aaa")
        var us2 = Users(2,"Francisco","sss")
        var us3 = Users(3,"Jose","ddd")

        var lstUsers = listOf(us1,us2,us3)
        return  lstUsers
    }

}
