# Kotlin Bootcamp

## Operators

1. We can use operators like `+, -, *, /, %`

1. We can directly call functions on numbers like bellow

```kotlin

    val fish = 2
    println("Addition ${fish.plus(3)}")
    println("Minus ${fish.minus(1)}")
    println("Div ${fish.div(2)}")
    println("Inc ${fish.inc()}")
    //Output: Addition 5Minus 1Div 1Inc 3

    val x = 1
    x.toLong()
    // res4: kotlin.Long = 1

    val boxed: Number = 10
    boxed.toLong()
    // res5: kotlin.Long = 10

    // Assigning short value to long will cause a error like bellow
    val b: Byte = 1
    val i: Int = b
    // error: type mismatch: inferred type is Byte but Int was expected
    //val i: Int = b
    //            ^

    val b: Byte = 1
    val i: Int = b.toInt()
```

## Nullability

1. We cannot assign null value

```kotlin
val x: Int = null
//error: null can not be a value of a non-null type Int
//val x: Int = null
```

1. We can assign null values like bellow

```kotlin
val x: Int? = null

val lotsOfFish: List<String?> = listOf(null, null)

val evenMoreFish: List<String>? = null
```

1. A non null assertion operator`(!!)` will allow you to use null values and you will get a NullPointerException

```kotlin
var goldFish? = null
goldFish!!.eat() // Will throw NullPointerException

val goldFish: Int? = null
 goldFish.dec()
error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Int?
goldFish.dec()

val goldFish: Int? = null
 goldFish!!.dec()
java.lang.NullPointerException
```

1. To perform a certain operation only for non-null values, you can use the safe call operator together with let:

```kotlin
val listWithNulls: List<String?> = listOf("Kotlin", null)
for (item in listWithNulls) {
    item?.let { println(it) } // prints Kotlin and ignores null
}
```

1. We can do safe null checks while assigning values to the left hand side

```kotlin
person?.department?.head = managersPool.getManager()
```

1. Collection of nullables

```kotlin
val nullableList: List<Int?> = listOf(1, 2, null, 4)
val intList: List<Int> = nullableList.filterNotNull()
```

## Safe Casts

1. We can cast safely in kotlin without facing ClassCastException

```kotlin
val aInt: Int? = a as? Int
```


## Elvis Operator(?:)

```kotlin
val treats: Int? = null
val s = treats?.dec() ?: 0 // 0

val treats: Int? = 5
val s = treats?.dec() ?: 0 // 4

// Since throw and return are expressions in Kotlin, they can also be used on the right hand side of the elvis operator. 
fun foo(node: Node): String? {
    val parent = node.getParent() ?: return null
    val name = node.getName() ?: throw IllegalArgumentException("name expected")
    // ...
}
```

## Arrays and Loops


```kotlin
for (i in 0..100 step 7) println(i.toString() + " - ") // Print numbers divisble by 7

// Will add numbers divisble by 7 to list
var list3 : MutableList<Int> = mutableListOf()
for (i in 0..100 step 7) list3.add(i)
print(list3)
```