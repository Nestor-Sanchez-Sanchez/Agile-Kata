package fizzBuzz;

public class FizzBuzz2 {

	public String getResult(int number) {
		if (number % 3 == 0 && number % 5 == 0 && number % 7 == 0)
			return "fizz buzz pop";
		else if (number % 3 == 0 && number % 7 == 0)
			return "fizz pop";
		else if (number % 5 == 0 && number % 7 == 0)
			return "buzz pop";
		else if ( number % 7 == 0)
			return "pop";
		return Integer.toString(number);
	}
	
	public static void main(String[] args) {

		FizzBuzz2 fiz = new FizzBuzz2();

		System.out.println(fiz.getResult(7));

		System.out.println(fiz.getResult(28));

		System.out.println(fiz.getResult(77));

		System.out.println(fiz.getResult(21));

		System.out.println(fiz.getResult(63));
		
		System.out.println(fiz.getResult(126));

		System.out.println(fiz.getResult(35));

		System.out.println(fiz.getResult(70));

		System.out.println(fiz.getResult(140));

		System.out.println(fiz.getResult(105));

		System.out.println(fiz.getResult(210));

		System.out.println(fiz.getResult(315));
	}
}