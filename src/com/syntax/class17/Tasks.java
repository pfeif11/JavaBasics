package com.syntax.class17;

public class Tasks {

	int add(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public String makeReverse(String word) {
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		return reverse;
	}

	private String onlyVowels(String word) {
		String vowels = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
					|| word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
					|| word.charAt(i) == 'O' || word.charAt(i) == 'U') {
				vowels = vowels + word.charAt(i);
			}
		}
		return vowels;
	}

	public static void main(String[] args) {
		Tasks x = new Tasks();
		int[] array1 = { 5, 2, 3, 10 };
		System.out.println(x.add(array1));
		System.out.println(x.makeReverse("What's up"));
		System.out.println(x.onlyVowels("Whats up Ed"));

	}

}
