fun main(){
    var caro =classhumans("nyambura",29,54)
    caro.eat(5)
    println(caro.weight)
    caro.weight
    caro.speakspeech("Is this all that am feeling?")
    caro.birthdaydate(10)
    var jane =classhumans.username("misky","linda","mary","0789765677",'k')
    println(jane.email)
    println(jane.phoneNumber)
}
class classhumans(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        var foodweight = 2
        weight+=foodweight
        println("I am eating $foodweight kgs of food")


    }

    fun speakspeech(speech:String){
        println(speech)

    }
    fun birthdaydate(year:Int){
        age+=year
        println(age)

    }


    data class username(var firstname:String,var lastName:String,var email:String,var phoneNumber:String,var password:Char)




}