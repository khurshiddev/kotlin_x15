package list

fun main () {
    var name = mutableListOf("Oybek","Sonbe","Abduqodir")
        name.add("Jorabek")
        name.add("Muhammad Ali")
    for (i in 0..name.size -1) {
        println(name.get(i))
    }


}