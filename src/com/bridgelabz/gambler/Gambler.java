package com.bridgelabz.gambler;

import java.util.Random;

public class Gambler {
//As a Calculative Gambler if won or lost 50% of the stake, would resign for the day
	public static void main(String[] args) {
		System.out.println("welcome to Gambling Simulator program");
		 int stakePerDay = 100;
	     int betPerGame = 1;
	     int win = 1;
	     Random random = new Random(); //random object
	       while(stakePerDay > 50 && betPerGame < 150) {
	    	   int randomNumber = random.nextInt(2); // 0, 1
	        if(randomNumber == 1){
	        	stakePerDay++;
	            System.out.println("you win the won");
	        }else{
	        	stakePerDay--;
	            System.out.println("you lost the game");
	        }
	        System.out.println("stake per day : " + stakePerDay);
	    }
	}
}