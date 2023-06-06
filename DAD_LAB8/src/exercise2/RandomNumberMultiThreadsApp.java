package exercise2;


/**
 * This class demonstrate execution of multiple threads object
 * from the same class.
 *
 * @author emalianakasmuri
 *
 */
public class RandomNumberMultiThreadsApp {

	public static void main(String[] args) {

		// Create Runnable object
		Runnable randomNumberTask1 = new RandomNumberTask(1,100);
		Runnable randomNumberTask2 = new RandomNumberTask(5, 50);

		// Create thread objects
		Thread randomNumberThread1 = new Thread(randomNumberTask1);
		Thread randomNumberThread2 = new Thread(randomNumberTask2);

		// Execute threads
		randomNumberThread1.start();
		randomNumberThread2.start();
		
		//Name the threads
		Thread randomNumberThread3 = new Thread(randomNumberTask1);
		Thread randomNumberThread4 = new Thread(randomNumberTask2);
		
		/*2. Use the suitable constructor 
		 * with parameter and setName( ) on 
		 * either one of the thread objects.*/
		randomNumberThread3.setName("Random Number Thread 3");
		randomNumberThread4.setName("Random Number Thread 4");

		
		System.out.println("Program ends");


	}

}
