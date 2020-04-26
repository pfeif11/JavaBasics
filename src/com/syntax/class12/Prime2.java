package com.syntax.class12;

import java.util.LinkedList;

public class Prime2 {
	public static void main(String[] args) {
		LinkedList<Integer> primeNumbers=new LinkedList<>(); 
       
        boolean isPrime = true;
 
        //Start loop 1 to maxCheck
        for (int i = 1; i <= 100; i++) {
            isPrime = CheckPrime(i);
            if (isPrime) {
                primeNumbers.add(i);
            	//primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        // Print prime numbers from 1 to maxCheck
        System.out.println(primeNumbers);
    }
    public static boolean CheckPrime(int number) {
        int remainder;
        for (int i = 2; i <= number/2; i++) {
            remainder = number % i;
            //if remainder is 0 than numberToCheckber is not prime and break loop. Elese continue loop
            if (remainder == 0) {
                return false;
            }
        }
        return true;
 
    }

}
