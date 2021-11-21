package com.hans.kotlin.fundametals._04_companion_objects

open class Employee(val name: String) {



    companion object {

        fun createSupervisor(name: String): Supervisor {
            return Supervisor(name)
        }

        fun createManager(name: String): Manager {
            return Manager(name)
        }
    }
}

class Supervisor(name: String): Employee(name) {

}

class Manager(name: String): Employee(name) {

}