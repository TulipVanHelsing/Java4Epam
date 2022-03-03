
public class Calc {
	
	
	
	public static boolean isPrime(int val) {
	    if (val < 2)
	        return false;

	    for (int i = 2, max = (int)Math.sqrt(val); i <= max; i++)
	        if (val % i == 0)
	            return false;

	    return true;
	}
}
