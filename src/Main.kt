
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val person: PersonConfig = PersonConfigBuilder().setAge(16).build()
    println(person.age)
}