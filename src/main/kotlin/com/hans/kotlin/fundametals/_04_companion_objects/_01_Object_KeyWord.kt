package com.hans.kotlin.fundametals._04_companion_objects

data class Course(val id: Int, val title: String)

object Courses {
    val allCourses = mutableListOf<Course>()

    fun initialize() {
        allCourses.add(Course(1, "Kotlin Fundamentals"))
    }
}