/**
* Arena.java
*
* Arenas have a certain number of robots
*/


public class Arena implements Visitable
{
    private int numRobots;
	private int id;
	
	public Arena(int id, int numRobots)
	{
	    this.numRobots = numRobots;
		this.id = id;
	}
	
	public void accept(Visitor l) {
		l.message("Arena.numRobots: " + numRobots + "\n" + "Arena.id: " + id);
	}
	// You may add additional methods as needed 
}