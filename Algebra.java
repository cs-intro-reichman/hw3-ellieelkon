// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		// Replace the following statement with your code
		int ans = x1; 
		if (x2 > 0) {
			for (int i = 0; i < x2; i++){
			ans++;
			}
		} else {
			for (int i = 0; i > x2; i--){
			ans--;
			}
		}
		return ans;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		// Replace the following statement with your code
		int ans = x1;
		if (x2 > 0) {
			for (int i = 0; i < x2; i++){
			ans--;
			}
		} else {
			for (int i = 0; i > x2; i--){
			ans++;
			}
		}
		return ans;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		// Replace the following statement with your code
		int ans = 0;
		if (x2 > 0) {
			for (int i = 0; i < x2; i++){
			ans = plus(ans,x1);
			}
		} else {
			for (int i = 0; i > x2; i--){
			ans = minus(ans,x1);
			}
		}
		return ans;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		// Replace the following statement with your code
		int ans = x;
		if (n == 0) {
			ans = 1;
		} else if (x == 0) {
			ans = 0;
		} else {
			for (int i = 1; i < n; i++){
			ans = times(ans,x);
			}
		}
		return ans;
	}


	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		// Replace the following statement with your code
		int count = 0;
		if (x2 == 0) {
			return -1;
			}
		if (x1 == 0) {
			return 0;
			}
		 else if (x1 > 0 && x2 > 0) {
			for (int i = x2; i <= x1; i = plus(i, x2)){
			count++;
			}
		} else if (x1 < 0 && x2 > 0) {
			x1 = times(x1, -1);
			for (int i = x2; i <= x1; i = plus(i, x2)){
			count++;
			}
			return times(count, -1);
		} else if (x1 > 0 && x2 < 0) {
			x2 = times(x2, -1);
			for (int i = x2; i <= x1; i = plus(i, x2)){
			count++;
			}
			return times(count, -1);
		} else if (x1 < 0 && x2 < 0) {
			x2 = times(x2, -1);
			x1 = times(x1, -1);
			for (int i = x2; i <= x1; i = plus(i, x2)){
			count++;
			}
		}
		return count;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		// Replace the following statement with your code
		int ans = 0;
		if (x2 == 0) {
			ans = x1;
		} else if (x1 == 0) {
			ans = 0;
		} else {
			ans = minus(x1, times(div(x1, x2), x2));
		}
		return ans;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		// Replace the following statement with your code
		int ans = 0;
		int answer =0;
		if (x < 0){
			return -1;
		} else if (x == 0){
			return 0;
		} else if (x == 1){
			return 1;
		} else {
			for (int i = 1; ans < x; i++){
				ans = pow(i, 2);
				answer = i;
				} if (ans == x) {
					return answer;
				} else {
					return minus(answer, 1);
				}
			

		}
	}	  	  
}
