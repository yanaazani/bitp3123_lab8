package exercise2;


import java.util.Random;

import exercise5.CurrentTimeRandomNumber;

/**
 * This class represent a task to generate a random number.
 * 
 * @author emalianakasmuri
 *
 */
public class RandomNumberTask  implements Runnable{
	
	private Random random;
	private int min;
	private int max;
	
	public RandomNumberTask (int min, int max) {
		
		random = new Random();
		
		this.min = min;
		this.max = max;
	}
	
	/**
	 * This method gets a random number between min and max values
	 * 
	 * @return a random number
	 */
	public int getRandomNumber () {
		
		int number = random.nextInt(max-min) + min;
		
		return number;
	}

	public void run1() {
		for(int counter=0; counter<10; counter++)
		{
			System.out.println(getRandomNumber());
		}
		
	}
	
	@Override
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Thread "+ "\t" + "Random Number ");
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println(currentThread.getName() + "\t" + getRandomNumber());
		}
	}


	//Exercise 5 
	//Task2: Create thread objects
	CurrentTimeRandomNumber currentTimeRandommNumber1=new CurrentTimeRandomNumber();
	CurrentTimeRandomNumber currentTimeRandommNumber2=new CurrentTimeRandomNumber();

			
	
	

}
