fun traditionalIf() {
	var a = 10;
	var b = 20;
	var max: Int;


	if (a > b) {
		max = a;
	} else {
		max = b;
	}

	println("The largest value is " + max + " (traditional if)")
}

fun evalExpression() {
	var a = 10;
	var b = 20;

	// Kotlin doesn't support the ternary operator.  It uses expressions instead:
	var max = if (a > b) a else b;

	println("The largest value is " + max + " (expression)")
}

fun main(args: Array<String>) {
	traditionalIf();
	
	evalExpression();
}
