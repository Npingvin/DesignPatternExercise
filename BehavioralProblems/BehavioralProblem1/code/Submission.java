/**
* Submission.java
*
* A representation of a Submission
*/

import java.util.Random;
import java.util.LinkedList;

public class Submission
{	
    private Random myRandom;
	private boolean lastErrorWasTimeout;
	private LinkedList<Observer> observers;

    // You may add attributes to this class if necessary

	public Submission()
	{
	    Random myRandom = new Random();
		lastErrorWasTimeout = false;
	
	    // Initialize attributes as necessary
	}

	public void attach(Observer o)
	{ observers.add(o); }

    public void runTestCase()
	{
	    // For now, randomly pass or fail, possibly due to a timeout
		boolean passed = myRandom.nextBoolean();

		
		if(!passed)
		{
		    lastErrorWasTimeout = myRandom.nextBoolean();
		}
		
		for(short i = 0; i < observers.size(); i++)
			{ observers.get(i).update(passed, lastErrorWasTimeout); }
	}

    public boolean wasTimeoutError()
	{
	    return lastErrorWasTimeout;
	}
}