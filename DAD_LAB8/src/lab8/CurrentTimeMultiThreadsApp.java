package lab8;



/**
 * This class demonstrate the application of multiple threads object in
 * a simple Java multithreaded application
 *
 * @author emalianakasmuri
 *
 */
public class CurrentTimeMultiThreadsApp {

	public static void main(String[] args) {

		// Create thread objects
		Thread currentTimeThread1 = new CurrentTimeTask();
		Thread currentTimeThread2 = new CurrentTimeTask();

		/* 1. Give two different names for the two thread 
		 * objects in
		 * CurrentTimeMultiThreadsApp.java.*/
		Thread currentTimeThread3 = new CurrentTimeTask();
		Thread currentTimeThread4 = new CurrentTimeTask();
		
		/*2. Use the suitable constructor 
		 * with parameter and setName( )
		 *  on either one of the thread objects.*/
		currentTimeThread3.setName("Thread 3");
		currentTimeThread4.setName("Thread 4");
		
		// Execute threads
		currentTimeThread2.start();
		currentTimeThread1.start();

		System.out.println("Program ends");

	}

}
