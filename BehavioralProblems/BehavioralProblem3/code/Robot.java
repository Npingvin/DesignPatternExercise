/**
* Robot.java
*
* Robots have positions in the simulation
*/


public class Robot implements Visitable
{
    private double x;
	private double y;
	private int id;
	
	public Robot(int id, double x, double y)
	{
	    this.x = x;
		this.y = y;
		this.id = id;
	}
		
	// You may add additional methods as needed 
		public void accept(Visitor l) {
		l.message("RobotLocation: (" + x + ", " + y + ")\n" + "Robot.id: " + id);
	}
}