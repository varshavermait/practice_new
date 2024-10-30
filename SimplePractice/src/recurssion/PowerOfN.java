package recurssion;

public class PowerOfN {
	
	public double calculatePow(double num, int n)
	{
		if(num == 0) return 0;
		double res = num;
		for(int i=1; i<n; i++)
		{
			res = res*num;
		}
		return res;
	}
	
	public double calculatePowRec(double num, int n)
	{
		if(num == 0) return 0;
		if(n == 0) return 1;
		
		return calculatePowRec(num, n-1) * num;
	}
	

/****
-100.0 < num < 100.0
-231 <= n <= 231-1
n is an integer.
Either num is not zero or n > 0.
-104 <= num*n <= 104
*****/
	
	 public double calculatePowRecOpt(double x, int n) {
	        if(n == 0)
	            return 1;
	        int num = n/2;
	        if(n<0){
	            x = 1/x;
	            num = -num;
	        }
	        double tmp = calculatePowRecOpt(x, num);
	        return (n%2 == 0) ? tmp * tmp : x*tmp * tmp;
	    }

	 public long calculatePowPositive(int x, int n) {
	        if(n == 0)
	            return 1;
	        int num = n/2;
	        long tmp = calculatePowPositive(x, num);
	        return (n%2 == 0) ? tmp * tmp : x*tmp * tmp;
	    }
//	 public double calculatePowRecWithZero(int x, int n, int zero) {
//	        if(zero == 0)
//	            return calculatePowPositive(x, n);
//	        if(zero == 1)
//	        {
//	        	long powTen = calculatePowPositive(x, 10);
//	        	for(int i=0; i<n; i++)
//	        		powTen = powTen*powTen;	
//	        	return powTen;
//	        }
//	        return calculatePowRecWithZero(x)
//	    }
}
