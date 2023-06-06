package lab8;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This class represent a task to print current time
 * 
 * @author emalianakasmuri
 *
 */
public class CurrentTimeTask extends Thread {
	
	private DateFormat dateFormat;
	private Calendar calendar;
	
	public CurrentTimeTask() {
		
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.ms");
		calendar = Calendar.getInstance();
	}
	
	/**
	 * This method gets a current time
	 * 
	 * @return a current time
	 */
	public String getCurrentTime() {
		
		return dateFormat.format(calendar.getTime());
	}
	
	public void run1() {
		Thread currentThread = Thread.currentThread();
		System.out.println(currentThread.getName());
			for(int counter=0; counter<10; counter++)
			{
				System.out.println(counter+"\t"+getCurrentTime());
				
			}
		}
		
	@Override
	public void run()
	{
		try{
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName());
			for(int counter=0; counter<10; counter++)
			{
				System.out.println(counter+"\t"+getCurrentTime());
				Thread.sleep(4000);
			}
		}
		catch(Exception ex)
		{
		System.out.println("Program is finished");
		}
	}
	
	
	

}
