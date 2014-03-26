import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	private static final int SMALLEST_PRIME = 2;
	
	
	public PrimeFactors() {
	}
	
	public List<Integer> find(int input) {
		List<Integer> result = new ArrayList<>();

		if (input < SMALLEST_PRIME)
		{
			return result;
		}
		else if (isPrime(input))
		{
			result.add(input);
			return result;
		}
		int prime = getNextPrime(0);
		while (prime <= input)
		{
			int remainder = input % prime;
			if (remainder == 0)
			{
				result.add(prime);
				result.addAll(find(input / prime));
				break;
			}
			else
			{
				prime = getNextPrime(prime);
			}
		}
		return result;
	}

	private int getNextPrime(int prevPrime) {
		
		int nextPrime;
		for (nextPrime = prevPrime + 1; !isPrime(nextPrime); nextPrime++);
		return nextPrime;
		
	}

	private boolean isPrime(int number)
	{
		if (number < SMALLEST_PRIME)
		{
			return false;
		}
		for (int i = SMALLEST_PRIME; i < Math.sqrt(number) + 1 && i < number; i++)
		{
			if (number % i == 0)
			{
				return false;
			}
		}
		System.out.println(number);
		return true;
	}
}
