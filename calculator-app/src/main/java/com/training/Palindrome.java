package com.training;

class InvalidWordException extends RuntimeException {

	public InvalidWordException() {

	}

	public InvalidWordException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InvalidWordException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InvalidWordException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InvalidWordException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

public class Palindrome {

	public boolean checkPalindrome(String word) {
		String reverse = "";

		if (word.equalsIgnoreCase("ofss") || word.equalsIgnoreCase("oracle")) {
			throw new InvalidWordException();
		} else {
			int length = word.length();
			for (int i = length - 1; i >= 0; i--)
				reverse = reverse + word.charAt(i);
			if (word.equals(reverse))
				return true;
			else
				return false;
		}
	}
}
