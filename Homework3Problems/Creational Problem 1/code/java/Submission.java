/**
* Submission.java
*
* A basic dummy Submission object for use with the autograder
*/

import java.util.Random;

public class Submission
{
  private int id;

  public Submission()
  {
    // Give this submission a unique(ish) id
    Random rand = new Random();
    id = rand.nextInt(10000000); 
  }

  public int id() { return this.id; }
}
