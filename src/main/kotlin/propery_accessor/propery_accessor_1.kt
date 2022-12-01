package propery_accessor

class Friend(
    var name:String ,
    var address: String ,
    var city: String ,
    var street: String
) {

    fun myFriend(): String {
        return name

    }
}

fun main() {
    val friend = Friend("Oybek","Koryo University","Seoul","river")
    friend.name
    friend.address
    friend.city
    friend.street
    friend.myFriend()
}





