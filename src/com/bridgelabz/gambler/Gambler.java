package com.bridgelabz.gambler;

import java.util.Random;

public class Gambler {
//make $1 bet so either win or loose $1
	public static void main(String[] args) {
		System.out.println("welcome to Gambling Simulator program");
		 int stakePerDay = 100;
	     int betPerGame = 1;
	     int win = 1;
	     Random random = new Random();
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