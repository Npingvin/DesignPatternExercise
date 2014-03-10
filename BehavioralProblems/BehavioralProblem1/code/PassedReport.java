public class PassedReport implements Observer {
	private boolean passed;
	public PassedReport(Submission s) { s.attach(this); }
	public void update(boolean passed, boolean timeout)
		{ this.passed = passed; }
	public void report()
		{ System.out.println("Passed: " + passed); }

}