package PracticePrograms;

import java.util.Scanner;

public class vowelsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner scc=new Scanner(System.in);
		String str=scc.nextLine();
		char[] st=str.toCharArray();
		int count=0;
		for(char ch:st) {
			switch(ch) {
			case 'a':
			case 'i':
			case 'e':
			case 'o':
			case 'u':
				count++;
				break;
			}
		}
 System.out.println("number of vowels in a string= "+count);
	}

}
