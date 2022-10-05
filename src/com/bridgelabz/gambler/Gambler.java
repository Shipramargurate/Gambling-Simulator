package com.bridgelabz.gambler;

import java.util.Random;

public class Gambler {
//After 20 days of playing every day would like to know the total amount won or lost.
	public static void main(String[] args) {
		System.out.println("welcome to Gambling Simulator program");
		int stakePerDay = 100;
		int betPerGame = 1;
		int win = 1;
		Random random = new Random(); // random object
		for (int day = 1; day <= 20; day++) {
			stakePerDay = 100;
			while (stakePerDay > 50 && betPerGame < 150) {
				int randomNumber = random.nextInt(2); // 0, 1
				if (randomNumber == 1) {
					stakePerDay++;
				} else {
					stakePerDay--;
				}
			}
		}
		System.out.println("Total money left after 20days : " + stakePerDay);
	}
}