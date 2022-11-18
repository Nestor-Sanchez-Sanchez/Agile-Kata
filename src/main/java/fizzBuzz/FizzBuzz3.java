package fizzBuzz;

public class FizzBuzz3 {

	public String getResult(int number) {
		
		if (number % 2 == 0 && number % 3 == 0)
			return "fuzz buzz";
		else if (number % 3 == 0)
			return "bizz";
		else if (number % 2 == 0)
			return "fuzz";
	
		return Integer.toString(number);
	}
	
	public static void main(String[] args) {

		FizzBuzz3 fiz = new FizzBuzz3();

		System.out.println(fiz.getResult(1));
		
		System.out.println(fiz.getResult(2));

		System.out.println(fiz.getResult(8));

		System.out.println(fiz.getResult(4));

		System.out.println(fiz.getResult(9));

		System.out.println(fiz.getResult(12));
		
	
	}

}
