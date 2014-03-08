/**
* Database.java
*
* A simple database simulation
*/

import java.lang.Thread;

public class Database implements Transaction {
	private String address;
  public Database(String address) {
  	this.address = address;
  }

  public void openDatabase()
  {
    System.out.println("Connecting to the database");
  }

  public void executeSQL(String sql)
  {
    System.out.println("Executing the SQL command: " + sql);
    System.out.println("(This can take some time....)");
   
    try { 
      Thread.sleep(5000);
    }
    catch (Exception e) { }    
  } 

  public void closeDatabase() 
  {
    System.out.println("Closing the database");
  }
}
