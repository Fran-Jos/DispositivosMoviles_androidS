package com.uce.fjchanataxi.p.logica

class SingIn {

    fun checkUserAndPassword(user: String, password: String):Boolean{
        if(user.equals("Admin") && password.equals("12345"))
            return true
        return false
    }
}