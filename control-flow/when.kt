fun evalValue(x: Int) {
	// when provides functionality similar to that provided 
	// by the switch statement in other languages.

	// Simple
	when (x) {
    	1 -> println("Eval: x == 1")
    	2 -> println("Eval: x == 2")
    	else -> {
        	println("Eval: x is neither 1 nor 2")
    	}
	}
}

fun main(args: Array<String>) {
	var x: Int;

	println("Set x to 3");
	x = 3;

	evalValue(x);

	println("Set x to 2");
	x = 2;

	evalValue(x);
}