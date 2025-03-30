abstract class BcsdLabUser{
    abstract val name: String
    abstract val emoticon: String
}

class Beginner(val undoingAssignments: Int,
               override val name: String,
               override val emoticon: String,
) : BcsdLabUser()
class Regular(val paid: Boolean,
              override val name: String,
              override val emoticon: String
) : BcsdLabUser()
class Mento(val email: String,
            override val name: String,
            override val emoticon: String
) : BcsdLabUser()

fun main() {
    val students = listOf(
        Beginner(undoingAssignments = 3, name = "kim", emoticon = "seed"),
        Beginner(undoingAssignments = 1, name = "carti", emoticon = "seed"),
        Beginner(undoingAssignments = 0, name = "mac", emoticon = "seed"),
        Regular(paid = false, name = "kwon", emoticon = "apple"),
        Regular(paid = true, name = "nas", emoticon = "apple"),
        Mento(email = "top@mail.com", name = "양꼬치", emoticon = "star")
    )

    println("Beginners list")

    val beginners = students.filterIsInstance<Beginner>()
    for (beginner in beginners) {
        println("Name: ${beginner.name}, Undoing Assignments: ${beginner.undoingAssignments}, Emoticon: ${beginner.emoticon}")
    }

    println("")
    println("Beginners who undoing assignment list")

    val beginnersUndo = students.filterIsInstance<Beginner>().filter{it.undoingAssignments >=3}
    for (beginner in beginnersUndo) {
        println("Name: ${beginner.name}, Undoing Assignments: ${beginner.undoingAssignments}, Emoticon: ${beginner.emoticon}")
    }

    println("")
    println("Unpaying regulars list")

    val regularsUnpaid = students.filterIsInstance<Regular>().filter { it.paid == false }
    for (regular in regularsUnpaid){
        println("Name: ${regular.name}, paid: ${regular.paid}, emoticon: ${regular.emoticon}")
    }

    println("")
    println("Yangs list")

    val yang = students.filter{it.name.startsWith("양")}
    for(people in yang){
        println("Name: ${people.name}, Emoticon: ${people.emoticon}")
    }
}

