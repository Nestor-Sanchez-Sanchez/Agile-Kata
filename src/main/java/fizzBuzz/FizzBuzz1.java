package fizzBuzz;

public class FizzBuzz1 {

	public String getResult(int number) {
		
		if (number % 3 == 0 && number % 5 == 0)
			return "fizz buzz";
		else if (number % 3 == 0)
			return "fizz";
		else if (number % 5 == 0)
			return "buzz";
		return Integer.toString(number);
	}

	public static void main(String[] args) {

		FizzBuzz1 fiz = new FizzBuzz1();

		System.out.println(fiz.getResult(2));
		

		System.out.println(fiz.getResult(3));

		System.out.println(fiz.getResult(9));

		System.out.println(fiz.getResult(123));

		System.out.println(fiz.getResult(5));

		System.out.println(fiz.getResult(20));
		
		System.out.println(fiz.getResult(200));

		System.out.println(fiz.getResult(15));

		System.out.println(fiz.getResult(45));

		System.out.println(fiz.getResult(315));

	
	}

}
