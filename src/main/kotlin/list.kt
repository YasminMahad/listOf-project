fun main (){
    var fruitNames = fruits(listOf("Mango", "Apple", "Pinapple", "Watermelon","Lemon","Strawberry","Guava","Orange","Banana","Papaya"))
    println(fruitNames)

    heights(listOf(3.4,33.1,2.34,1.2,7.4))

    var person = Person("Yasmin",55,54.2, 23.1)
    var person2 = Person("Sara",12,33.2, 34.5)
    var person3 = Person("Ahmed",76,56.3, 95.1)
    var people = listOf(person,person2,person3)
    var order = people.sortedByDescending { person -> person.age }
    println(order)

    var person4 = Person("Abdulrahman",22,1.70,80.1)
    var person5 = Person("Liala",43,60.3,65.8)
    var morePeo = mutableListOf(person4,person5)
    println(people.plus(morePeo))

    var car = Car("Qe34dawe",453)
    var car2 = Car("K43M#W",65)
    var vehicles = listOf(car,car2)
    println(averageMileage(vehicles))


}

//Given a list of 10 strings, write a function that returns a list of the strings at even indices i.e index 2,4,6
fun fruits(fruit:List<String>):List<String>{
    var listFruit = mutableListOf<String>()
    fruit.forEachIndexed{index, s ->
        if (index %2 == 0)
            listFruit.add(s)
    }
    return fruit
}

//Give a list of people's heights in metres. Write a function that returns the height and the total height.
fun heights(people:List<Double>):String{
    var heightSum = people.sum()
    var heightAverage = people.average()
    var all = "$heightSum, $heightAverage"
    println(all)
    return all
}

//Given a list of Person objects, each with the attributes, name, age, height and weight. Sort the list in order of descending age.
data class Person(var name:String, var age:Int, var height:Double, var weight:Double )

//Given a list similar to the one above, write a function in which you will create 2 more people objects and add them to the list at one
fun addPeople(morePeople:List<Any>):List<Any>{
    return listOf()
}

//Write a function that takes in a list of Car objects each with a registration and mileage attribute and returns the average mileage of all the vehicle in the list.

data class Car (var registration:String, var mileage:Int)

fun averageMileage(type:List<Car>):Int{
    var x = 0
    type.forEach { cars ->
        cars.mileage
        x += cars.mileage
    }
    var result = x /type.count()
    return result
}