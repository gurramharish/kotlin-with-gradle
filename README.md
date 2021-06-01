# Kotlin Getting Started

## Installing kotlin

1. Download kotlin command line jar and set Kotlin_Home and `bin` in Path.

1. Compile command `kotlinc hello.kt`.

1. Run command `java -cp .;c:\kotlinc\lib\kotlin-runner.jar HelloKt`.

1. To generate jar `kotlinc hello.kt -inclue-runtime -d hello.jar`.

1. To run jar file `java -jar hello.jar`.

## What is Kotlin ?

1. JVM Language

1. Supports immutability

1. Abhors null - so kotlin tries us not to use nulls or where we are using nulls kotlin force us to cope up with those nulls

1. Object oriented - It has object keyword which allows us to create singleton objects

1. It doesnot have static keyword

1. Functional - Immutability, Higher order functions, functions are the first class citizens whithin the language. We can functions to functions and return functions from functions

1. Less ceremony than Java

1. Functions in kotlin are defined using keyword `fun`

```javascript
fun min(a: Int, b: Int): Int {
    return if(a < b) a else b
}
```

1. An immutable value is declared using the `val` keyword, such as value must be intialized once.

```javascript
val name:String = "Harish" // No need to specify type kotlin can infer the type for the variables declared with val keyword

val name = "Harish"
```

1. We can also declare variables using `var` keyword, which are mutable, can change over the lifetime of the applicaiton

```javascript
var password:String // value can be assigned later
```

1. String template support

```javascript
val name = "Harish"
print("My name is $name")
```

1. Kotlin support classes

```javascript
class Person(val name: String)
```

```javascript
class Person {
    val name: String
    val numberOfChildern: Int
}
```

### Programming with objects

1. Interface

```javascript
interface Signatory {
    fun sign()
}
```

1. Implementing an interface using (:)

```javascript
// val is immutable, provides get method
// var is mutable, provide getters and setters
class Person(private val name: String, var age: Int) : Signatory {
    override fun sign() {
        println("Signing as $name")
    }

    // override fun sign() = println("Signing the documents as $name")
}

fun main(args: Array<String>) {
    val person = Person("Harish", 31);
    person.sign()
    person.age = 32
    person.sign()
    println("Age of the person is ${person.age}")
    println("Name of the person is ${person.name}")
}
```

1. Classes are final by default in kotlin, so we can't derive sub classes.

1. To derive sub classes using parent class we need to explicitly open the class.

```javascript
open class Person(val name: String, var age: Int) : Signatory {
    override fun sign() {
        println("$name signned the documents")
    }
}

// In subclass we just declared the variables name and age, we didn't specify val or var, if we specify it will hide those properties from base type
class Student(name: String, age: Int) : Person(name, age) {}
```

1. For string comparision we can use `==` instead of equals method. `==` compares the value instead of reference unlike java

1. Secondary constructors can be created using `constructor` keyword

```javascript
constructor(name: String, age: Int, isMarried: Boolean): this(name, age) {
    this.isMarried = isMarried
}
```

### Data class

1. Often we require data classes to pass the data between classes or functions. We can create data classes in kotlin using `data` keyword. By marking class with `data` keyword, kotlin provides equals, hashcode, toString (and other) functions.

```javascript
data class User(val name: String, val id: Int)
```

1. Kotlin has destruction support for data classes by providng getComponent1 to n methods to destruct

```javascript
val (name, id) = person
```

1. We can clone the data objects using `copy` method provided by kotlin in data classes

```javascript
val sai = harish.copy(id = 31)
```

### Higher Order Functions

```javascript
fun getAllProviderDetails(filter: String): List<ProviderDetails> {
    val providers = getProviders()
    val allProviderDetails = mutableListOf<ProviderDetails>()
    return providers.flatMap { provider  ->  provider.entries
        .filter { it.key.toString().contains(filter, true) }
        .map { ProviderDetails(provider.name, it.key.toString()) }}
}
```