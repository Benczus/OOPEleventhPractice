package exceptionTest;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.nio.sctp.IllegalReceiveException;

public class Test {

	public static void main(String[] args) {
		
		int[] intArray =new int[5];
		try {
			intArray = getUserInputPrime(5);
		} catch (IntegerNotPrimeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	
		
		for (int i : intArray) {
			System.out.println(i);
		}
		
		
		
		
		

	}
	
	public static int[] getUserInput(int numberOfElements) throws InputMismatchException {
		int[] intArray= new int[numberOfElements];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter 5 integers!");
		for (int i = 0; i < intArray.length; i++) {
			
			int tempint=scanner.nextInt();
			if (tempint<=0) {
				throw new InputMismatchException("Input must be higher than 0!");
			}
		}
		return intArray;
	}
	
	public static int[] getUserInputPrime(int numberOfElements) throws IntegerNotPrimeException {
		int[] intArray= new int[numberOfElements];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter 5 integers!");
		for (int i = 0; i < intArray.length; i++) {
			
			int tempint=scanner.nextInt();
			if (!isPrime(tempint)) {
				throw new IntegerNotPrimeException();
			}
		}
		return intArray;
	}

	
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
}
}
