/**
* BankSim.java
*
* An example simulation showing how the bank interacts with the database
*/

public class Teller
{
  public static void main(String[] args)
  {
    DatabaseProxy db = new DatabaseProxy("localhost");

    System.out.println("Connecting to the database");
    db.openDatabase();

    System.out.println("Performing deposit #1");
    db.executeSQL("INSERT INTO accounts (acct_num, val) VALUES (123, 15.30)");
    
    System.out.println("Performing deposit #2");
    db.executeSQL("INSERT INTO accounts (acct_num, val) VALUES (456, 1.00)");

    System.out.println("Performing deposit #3");
    db.executeSQL("INSERT INTO accounts (acct_num, val) VALUES (789, 1000.00)");

    System.out.println("Finished with the day - closing the database");
    db.closeDatabase();
  }
}
