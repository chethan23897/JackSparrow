package com.bridgelabz.algorithms;

public class StringPermutation {
	public static void main(String[] args) {
		String s = "ABC";
		permutations("", s);
		System.out.println("---------------");

		String str = "ABCD"; 
		int n = str.length(); 

		permute(str, 0, n - 1); 

	}
	// Recursive function to generate all permutations of a String
	public static void permutations(String s, String t)
	{
		if (t.length() == 0) {
			System.out.println(s);
		}

		for (int i = 0; i < t.length(); i++)
		{
			String newCandidate = s + t.charAt(i);

			String newRemaining = t.substring(0, i) +
					t.substring(i + 1);

			permutations(newCandidate, newRemaining);
		}
	}






	public static void permute(String str, int l, int r) 
	{ 
		if (l == r) 
			System.out.println(str); 

		else { 
			for (int i = l; i <= r; i++) { 
				str = swap(str, l, i); 
				permute(str, l + 1, r); 
				str = swap(str, l, i); 
			} 
		} 
	} 

	// Iterative function to generate all permutations of a String
	public static String swap(String a, int i, int j) 
	{ 
		char temp; 
		char ch[] = a.toCharArray(); 
		temp = ch[i]; 
		ch[i] = ch[j]; 
		ch[j] = temp; 
		String str=new String(ch);
		return str; 
	} 
}
