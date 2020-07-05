package course.training;

public class Calculator {

	public static void main(String[] args) {
		

	SimpleCalculator calc = new SimpleCalculator();
	calc.setFirstNumber(5.0);
	calc.setSecondNumber(5);
	calc.setAdditionalResult(calc.getFirstNumber() + calc.getSecondNumber());
	calc.setSubtractionResult(calc.getFirstNumber() - calc.getSecondNumber());
	System.out.println("Addition: " + calc.getAdditionalResult());
	System.out.println("Sub: " + calc.getSubtractionResult());
	calc.setFirstNumber(5.25);
	calc.setSecondNumber(0);
	calc.setMultiplicationResult(calc.getFirstNumber() * calc.getSecondNumber());
	calc.setDivisionResult(calc.getFirstNumber() / calc.getSecondNumber());
	System.out.println("multiply = " + calc.getMultiplicationResult());
	System.out.println("divide = " + calc.getDivisionResult());
	}
}
