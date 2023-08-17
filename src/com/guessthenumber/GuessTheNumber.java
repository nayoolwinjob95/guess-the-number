package com.guessthenumber;

import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		int num;
		String input;
		boolean isContinue = true;
		Scanner scan = new Scanner(System.in);
		
		do {

			do {
				System.out.print("Input a number between 0 and 9: ");
				input = scan.nextLine();

				try {
					num = Integer.parseInt(input);
					if (num < 0 || num > 9) {
						System.out.println("Please only enter the number range from 0 to 9.");
						continue;
					}
					break;
				} catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("Please enter the valid number.");
				}
			} while(true);
			
			if (num == (int)(Math.random() * 10)) {
				System.out.println("Congratulation!");
				break;
			}

			isContinue = isContinueOrNot(scan);
			
		} while(isContinue);
		
		scan.close();
	}
	
	public static boolean isContinueOrNot(Scanner scan) {
		do {
			System.out.print("Sorry! Would you like to try again? (yes/no) : ");

			switch (scan.nextLine()) {
				case "yes" : 
					return true;
				case "no" :
					return false;
				default:
					System.out.println("Please enter the valid input.");
			}
		} while(true);
	}
}
