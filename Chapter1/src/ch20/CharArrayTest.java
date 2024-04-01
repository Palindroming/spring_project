package ch20;

public class CharArrayTest {

	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		
		char ch = 'A';
		
		for (int i = 0; i<alphabets.length; i++) {
			
			alphabets[i] = ch++;
			
		}
		/*
		 * 1

This is for eclipse.

window -> preferences -> java -> compiler -> configure project specific settings -> double click on created 'project name' -> uncheck 'use compliance from execution environment' -> then select 'compiler compliance level' to 1.5 or higher(best to choose the last level which is maximum and latest)

Done. now apply and close all. re run the program. */
		 
		
		for(char alpha : alphabets) {
			
			System.out.println(alpha + ","+(int)alpha);
		}

	}

}
  