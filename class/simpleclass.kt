class Greeter(name: String) {
	val nameProperty = name;  // Property initializer

	// Initializer block
    init {
        println("Length of name property is ${name.length}");
    }

	fun sayHello() {
		println("Hello ${nameProperty}");
	}

	fun sayGoodbye() {
		println("Goodbye ${nameProperty}");
	}
}

fun main(args: Array<String>) {
	var myGreeter = Greeter("Jim");  // Kotlin does not have a "new" keyword

	myGreeter.sayHello();
	myGreeter.sayGoodbye();
}
