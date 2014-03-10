/**
* Wall.java
*
* Walls have length and height, and start and end coordinates in the simulation
*/

import java.lang.Math;

public class Wall implements Visitable
{
    private double x0;
	private double y0;
	private double x1;
	private double y1;
	private int id;
	private double height;
	private double width;
	private double length;
	
	public Wall(int id, double x0, double x1, double y0, double y1, double height)
	{
	    this.x0 = x0;
		this.y0 = y0;
	    this.x1 = x1;
		this.y1 = y1;
	    this.height = height;
		this.length = Math.sqrt((x1-x0)*(x1-x0) + (y1-y0)*(y1-y0));
		this.id = id;
	}
		
	// You may add additional methods as needed 
	public void accept(Visitor l) {
		l.message("Height: " + height + "\n" + "Length: " + length);
	}
}