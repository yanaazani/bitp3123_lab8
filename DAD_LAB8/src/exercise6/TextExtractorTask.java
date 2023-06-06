package exercise6;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class TextExtractorTask extends Thread{

	private String text;
	private List<String> listOfText;
	
	public TextExtractorTask()
	{
		text = "“The List component presents the user with a\r\n"
				+ "scrolling list of text items. The list can be set up so that the user can\r\n"
				+ "choose either one item or multiple items. ";
		listOfText = new ArrayList<String>();
		
	}
	
	public void GenerateRandomText()
	{
		int randomIndex = (int) Math.floor(Math.random() * listOfText.size());
		TextExtractorTask object = new TextExtractorTask();
		for(int counter=0; counter<10; counter++)
		{
			object.append(listOfText.get(randomIndex)).append(" ");
		}
	
	
	}
	
	private PrintStream append(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void ExtractrRandomText()
	{
		int index = (int) Math.floor(Math.random() * listOfText.size());
		System.out.println(text.substring(0,index));
	}
	
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		if(currentThread.getName().equals("Generator") || currentThread.getName().equals("generator"))
		{
			GenerateRandomText();
		}
		
		else if(currentThread.getName().equals("Extractor") || currentThread.getName().equals("extractor"))
		{
			GenerateRandomText();
		}
		
		else
		{
			System.out.println("Error!");
		}
		
		
		
	}

}
