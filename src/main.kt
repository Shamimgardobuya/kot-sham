fun main(){
    hobby("dance")
    var me= Human("Salma",14,34)
    me.eat(23)
    println(me.name)
    println(me.weight)
    println(me.age)
    me.birthday()
    println(me.age)


}
fun hobby(activity:String){
    var p = activity
    println("I like to $p")
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        weight+=foodweight
        println("I am eating $foodweight kgs of food")

    }
    fun birthday(){
        var x = age++
      println(age)

    }

}