/**
* Logger.java
*
* Logger objects are used to log data from objects in a simulation
*/
import java.util.LinkedList;

public class Logger implements Visitor
{
    // Attributes - you may add attributes as you see fit
	private LinkedList<String> messages;

	public Logger()
	{
	    // Perform any attribute initialization here
	    messages = new LinkedList<String>();
	}

	public void message(String message) {
		messages.add(message);
	}
	
	public void visit(Visitable o) {
		o.accept(this);
	}

	public void logData()
	{
	    // Print out information about each object in the simulation
		for(short i = 0; i < messages.size(); i++) {
			System.out.println(messages.remove());
		}
	}
	
	// You may add additional methods as needed 
}