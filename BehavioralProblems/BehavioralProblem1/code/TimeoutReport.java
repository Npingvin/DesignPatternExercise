public class TimeoutReport implements Observer {
	private boolean timeout;
	public TimeoutReport(Submission s) { s.attach(this); }
	public void update(boolean passed, boolean timeout)
		{ this.timeout = timeout; }
	public void report()
		{ System.out.println("Timeout: " + timeout); }
}
