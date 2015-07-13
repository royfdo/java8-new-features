package java8.lambda.expression;

/**
 * This class defines mathematical operations.
 * 
 * @author roy
 */
public class MathOperation {

	private MathService addService = (x, y) -> x + y;

	private MathService substractService = (x, y) -> x - y;

	private MathService multiplicationService = (int x, int y) -> {
		return x * y;
	};

	public int add(int a, int b) {
		return addService.operation(a, b);
	}

	public int substract(int a, int b) {
		return substractService.operation(a, b);
	}
	
	public int multiply(int a, int b) {
		return multiplicationService.operation(a, b);
	}

}
