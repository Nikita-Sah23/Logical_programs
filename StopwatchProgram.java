package com.logicalProblems;

import java.util.Scanner;
import java.time.LocalDateTime;

public class StopwatchProgram {

	public static void main(String[] args) {

		//System.out.println("Welcome Stop Watch Program");
		
		Scanner scanner = new Scanner(System.in);
		// Start Stop Watch
		while (true) {
			System.out.print("Start stop watch by entering 1 : ");
			int start = scanner.nextInt();
			if (start == 1) {
				break;
			}
		}
		LocalDateTime startTime = LocalDateTime.now();
		
		// Stop Stop Watch
		while (true) {
			System.out.print("Stop stop watch by entering 0 : ");
			int start = scanner.nextInt();
			if (start == 0) {
				break;
			}
		}
		LocalDateTime stopTime = LocalDateTime.now();
		
		int hours = stopTime.getHour() - startTime.getHour();
		int minutes = stopTime.getMinute() - startTime.getMinute();
		int seconds = stopTime.getSecond() - startTime.getSecond();
		int nanoSeconds = stopTime.getNano() - startTime.getNano();
		System.out.println(hours+" : "+minutes+" : "+seconds);
		scanner.close();
	}
}