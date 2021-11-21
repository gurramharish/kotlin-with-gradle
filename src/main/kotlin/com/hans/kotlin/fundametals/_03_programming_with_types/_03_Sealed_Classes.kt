package com.hans.kotlin.fundametals._03_programming_with_types

// Used to restrict class Hierarchies
// Enums on steroids
sealed class Event {
    class SendEvent(val id: Int, val to: String) : Event()
    class ReceiveEvent(val id: Int, val from: String) : Event()
}

fun handleEvent(e: Event) = when(e) {
    is Event.SendEvent -> println(e.to)
    is Event.ReceiveEvent -> println(e.from)
}

sealed class PersonEvent {
    class Awake : PersonEvent()
    class Asleep : PersonEvent()
    class Eating(val food: String) : PersonEvent()
}


fun handlePersonEvent(event: PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("Awake")
        is PersonEvent.Asleep -> println("Asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}

