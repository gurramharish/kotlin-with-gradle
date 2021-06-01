package com.hans.user

import com.hans.model.UserDetails
import com.hans.signatory.Person

class UserService {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val ud = UserDetails()
            ud.name = "Harish"
            ud.age = 31
            println("User details is ${ud.name}")
            try {
                ud.name = " "
            } catch (e: Exception) {
                println(e.message)
            }
            val partner = ud.partner
            println(partner?.name)
        }
    }
}