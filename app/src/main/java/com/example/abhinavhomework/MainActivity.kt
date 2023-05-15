package com.example.abhinavhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun exercise2 (){
    val numbers = mutableListOf(1,2,3,4,5,6,7,8,9,10)
    for(item in numbers){
        //2
        val condition = item >=6
        //3
        if(condition) {
            Log.i("DEMO", item.toString())
        } else {
            Log.i("DEMO","The number is less than 6")
        }
    }

    val number = mutableListOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,
    )
    number.remove(8)
    number.remove(10)
    number.add(15)
}
fun classexercise(){
    // assignment2
    val myWeight:Byte=60
    val myyearofbirth:Short=2001
    val number3= 3345678912L
    val myint= 50100
    val numbercopy= 60

    // assignmemnt3
    val firstname = "Abhinav"
    val secondname = "Aswal"
    val fullname = firstname + " " + secondname
    val age = 22
    Log.i("DEMO", "Hello $firstname, you are $age years old.\nYour full name is $fullname.")

    val user = arrayOf (
            "aswalabhinav@gmail.com",
            "satendrakumar123@gmail.com",
            "aswalanita@gmail.com",
            "shivanshiaswal@gmail.com",
            "srutipandey@gmail.com",
            "nitinjoshi@gmail.com",
            "gauravthakur@gmail.com",
            "prashantverma@yahoo.com",
            "sakibali@yahoo.com",
            "umangchauhan@yahoo.com",
    )
    val examplehomework ="DEMO"

    val number = arrayOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,)
    val numbers1 = mutableListOf(
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10,)
    val numbers2 = mutableListOf(
            15,
            16,


            )
    numbers1.addAll(numbers2)

    numbers1.remove(7)
    for (item in numbers1){
        Log.i("DEMO",item.toString())
    }
}

fun homework4(){
    // assignbment4
    var x = 5
    var y = 7
    var z = 10
    var pi = 3.14159
    var radius = 4

    val add = x+y+z
    Log.i("DEMO", "x + y + z= $add")

    val divide  = z/y
    Log.i("DEMO", "z / y = $divide")

    var circleArea = radius * pi

    Log.i("DEMO", "$radius * $pi ")

    radius = x
    Log.i("DEMO", "$radius * $pi ")
}

fun assignment5(){
    val movies=mutableListOf(
            "Malang",
            "Bhootnath",
            "Sanam Teri Kasam",
            "Bareily Ki Barfi",
            "Yeh Jawani Hai Deewani")

    movies.add("Main Tera Hero")
    movies.remove("Malang")
    android.util.Log.i( "DEMO", "movies ")

    var i: Any = android.util.Log.i("DEMO", "movie")

    movies.addAll(mutableListOf("Singham"))
}

private infix fun Any.mutablelistof(s: String) {
    TODO("Not yet implemented")
}
fun day7exercise(){
    var x = 2
    var y = 3
    var z = 7
    Log.i("DEMO","x,y,z")

    var c1 = "Dehradun"
    var c2 = "Masuri"
    var c3 = "Selaqui"
    Log. i("DEMO", "c1,c2,c3")

    var sum = ("x+y")

    listof("Dehradun","Masuri","Selaqui" )
}

fun listof(c1: String, c2: String, c3: String) {

}
