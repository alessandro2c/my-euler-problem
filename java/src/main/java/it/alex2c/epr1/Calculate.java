/*******************************************************************************
* Copyright (C) 2019 acipriani
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
package it.alex2c.epr1;

/**
 * Euler Problem 1 java Solution
 *
 */
public class Calculate {
	// public static void main( String[] args )
	// {
	// System.out.println( "Hello World!" );
	// }
	public static int eulerProblem1(int max) {

		int sum = 0;

		for (int i = 0; i < max; i++)
			if (i % 3 == 0 || i % 5 == 0)
				sum = sum + i;

		// System.out.println("sum vale:" + sum);
		return sum;
	}

	public static long eulerProblem2() {
		long max = 4000000L;
		long sum = 0L;
		int relativeCounter = 2;
		long[] fibonacciList = new long[1000];
		fibonacciList[0] = 1L;
		fibonacciList[1] = 2L;
		for (int i = 2;; i++) {
			relativeCounter++;
			fibonacciList[i] = fibonacciList[i - 1] + fibonacciList[i - 2];
			if (fibonacciList[i] > max) {
				// System.out.println(fibonacciList[i]);
				relativeCounter--;
				break;
			}
		}
		// for(int i = 0; i < relativeCounter; i++){
		// System.out.println(fibonacciList[i]);
		// }
		for (int i = 0; i < fibonacciList.length; i++)
			if (fibonacciList[i] % 2 == 0)
				sum = sum + fibonacciList[i];

		// System.out.println("sum vale:" + sum);
		return sum;
	}

	public static long eulerProblem3(long max) {
		long[] primi = new long[10000000];
		boolean primo = false;
		long i, j = 0;
		long inf = 2;
		int count = 0;

		for (i = inf; i <= max; i++) {
			// System.out.println("i: " + i);
			primo = true;
			for (j = i; j > inf; j--) {
				// System.out.println(" j" + j);

				if (i % (j - 1) == 0) {
					primo = false;
					break;
				}
			}
			// System.out.println("primo: " + primo);
			if (primo) {
				primi[count] = i;
				count++;
			}

			// if (count % 1000 == 0)
			// System.out.println("dim: " + count + "--- i: " + i);
		}

		for (int c2 = count - 1; c2 >= 0; c2--) {

			// System.out.println("" + primi[c2]);

			if ((max % primi[c2]) == 0) {
				// System.out.println("trovato " + primi[c2]);
				return primi[c2];
			}

		}

		return 0;
	}

	public static long eulerProblem3v2(int max) { // crivello di eratostene

		boolean[] nums = new boolean[max + 1];
		int i = 2;

		for (int j = 0; j <= max; j++) {
			nums[j] = true;
		}

		nums[0] = false;
		nums[1] = false;

		int k = 2;
		while (i <= max) {

			if (nums[i]) {
				k = 2;
				// System.out.println("entro in: " + i);
				while (i * k <= max) {
					nums[i * k] = false;
					k++;
				}
			}
			i++;
		}

		for (int j = max; j > 2; j--) {
			if (nums[j] == true) {
				if (max % j == 0) {
					// System.out.println("trovato è: " + j);
					return j;

				}
			}
		}

		return 0;
	}

	public static long eulerProblem3v3(long max) {

		// boolean[] nums = new boolean[max + 1];
		long i = 2;
		long candidate = 2;

		// for (int j = 0; j <= max; j++) {
		// nums[j] = true;
		// }

		// nums[0] = false;
		// nums[1] = false;

		int k = 2;
		while (i <= max) {
			// System.out.println("i vale: " + i);

			// if (nums[i]) {
			k = 2;
			// System.out.println("entro in: " + i);
			while (i * k <= max) {
				// System.out.println("k vale: " + k);

				if (i * k == max) {
					candidate = i;
				}
				k++;
			}
			// }
			i++;
		}
		// System.out.println("il candidate dovrebbe essere: " + candidate);
		//
		// for (int j = max; j > 2; j--) {
		// if (nums[j] == true) {
		// if (max % j == 0) {
		// System.out.println("trovato è: " + j);
		// break;
		// }
		// }
		// }

		return 0;
	}

	public static long eulerProblem3v4(long max) {

		long limit = (long) Math.sqrt(max) + 1; // dal crivello di eratostene
		// System.out.println("limit vale: " + limit);

		for (long i = limit; i >= 2; i--) {

			if (max % i == 0) {
				// System.out.println("ho trovato un divisore: " + i);
				if (isPrime(i)) {
					// System.out.println("numero primo è: " + i);
					return i;
				}
			}

		}

		return 0;
	}

	public static long eulerProblem4() {

		int palindrome = 0;
		int factori = 0;
		int factork = 0;

		for (int i = 999; i >= 100; i--) {

			for (int k = i; k >= 100; k--) {

				if (isPalindrome(i * k)) {
					if (i * k > palindrome) { // il più grande fra tutti i palindromi
						palindrome = i * k;
						factori = i;
						factork = k;
					}

					// System.out.println("il numero è: " + i*k + " prodotto da " + i + " " + k);
					// return true;
				}

			}
		}

		// System.out.println("il numero è:" + palindrome + " " + factori + " " +
		// factork);
		return palindrome;
	}

	public static long eulerProblem5() {

		//long[] factorsOrig = new long[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		long[] factors = new long[] { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		// long[] factorsOrig = new long[] {4, 7 , 6};
		// long[] factors = new long[] {4, 7 , 6};
		int minIndex = 0;
		int i, j, k;

		k=0;
		for (i = 0; i < factors.length; i++) {
			for (j = (factors.length - 1); j >= 0; j--) {

				if (factors[j] % factors[i] == 0 && i != j) {
					factors[i] = 1;
					k++;
					break;
				}

			}
		}

		j=0;
		long[] exFactors = new long[factors.length - k];
		long[] exFactorsOrig = new long[factors.length - k];
		for (i = 0; i < factors.length; i++) {
			//System.out.println(factors[i]);
			if (factors[i] != 1) {
				exFactors[j] = factors[i];
				exFactorsOrig[j] = factors[i];
				j++;
			}
				
		}
		
//		for (i = 0; i < exFactors.length; i++) {
//			System.out.println(exFactors[i]);
//		}
		

		while(!areEquals(exFactors)) {
			minIndex = extractMinIndex(exFactors); 
			//System.out.println("minindex vale: " + minIndex);
			//System.out.println("ele1 ----" + factors[minIndex]);
			exFactors[minIndex] = exFactors[minIndex] + exFactorsOrig[minIndex];
			//System.out.println("ele2 ----" + factors[minIndex]);

			
		}
		
		System.out.println(exFactors[0]);

		return exFactors[0];
	}
	
	public static int eulerProblem6(int n) {
		
		int s1 = (n*(n+1)) / 2;
		
		int s2 = (n*(n+1)*(2*n + 1))/6;
		
		int res = ((s1*s1) - s2);
		
		System.out.println(res);
		
		return res;

	}

	private static int extractMinIndex(long[] vals) {
		int lastIndex = 0;

		for (int i = 0; i < vals.length - 1; i++) {

			if (vals[lastIndex] > vals[i + 1]) {
				lastIndex = i + 1;
			}
		}

		return lastIndex;

	}

	private static boolean areEquals(long[] vals) {

		for (int i = 0; i < vals.length - 1; i++)
			if (vals[i] != vals[i + 1])
				return false;

		return true;

	}

	private static boolean isPalindrome(int numb) {

		int length = (int) (Math.log10(numb) + 1);
		// System.out.println("numb: " + numb);
		// System.out.println("lenth: " + length);
		int[] digits = new int[length];
		int i = 0;
		while (numb > 0) {
			digits[i] = (numb % 10);
			numb = numb / 10;
			i++;
		}

		/*
		 * for (int d:digits) { System.out.println(d); }
		 */

		// if(length%2 == 0){
		for (i = 0; i < length / 2; i++) {
			// prendo al cifra iesima
			// int di = ;
			// int dlast = numb % (10 ^ (length-i));

			// System.out.println("di: " + digits[i]);
			// System.out.println("dlast: " + digits[length - i-1]);

			if (digits[i] != digits[length - i - 1])
				return false;
		}
		return true;
		// }
		/*
		 * else { for (i = 0; i<length/2;i++) { //prendo al cifra iesima //int di = ;
		 * //int dlast = numb % (10 ^ (length-i));
		 * 
		 * // System.out.println("di: " + digits[i]); // System.out.println("dlast: " +
		 * digits[length - i-1]);
		 * 
		 * if (digits[i] != digits[length-i-1]) return false; } return true; }
		 */
		// return false;
	}

	private static boolean isPrime(long numb) {

		// System.out.println("faccio il test: " + numb);

		// long[] a = {0,0};
		int count = 0;
		long f = 3;
		int i = 0;

		while (numb % 2 == 0) {

			count++;
			numb /= 2;
			if (count > 2)
				return false;

		}
		while (f * f <= numb) {

			if (numb % f == 0) {

				// if(a[0] == 0 || a[0] == f) {
				// System.out.println();
				// a[0] =f;
				// }else {
				// a[1] = f;
				// //return false; // ha almeno 2 fattori
				// }
				// System.out.println("f vale: " + f);
				numb /= f;
				count++;
				if (count >= 2)
					return false;

				// System.out.println("numb vale: " + numb);
				// if (a[1] != 0)
			} else {
				f += 2;
			}

		}
		// System.out.println("numb vale:" + numb);
		// System.out.println("f vale:" + f);
		// System.out.println("count vale: " + count);
		if (numb != 1) {
			count++;
			if (count >= 2)
				return false;
		}
		return true;

	}
}
