import java.util.LinkedList;

public class SubQueue {
	
	private static SubQueue q = null;
	private LinkedList<Submission> ll;
	
	public static synchronized SubQueue getInstance() {
		if (q == null) { q = new SubQueue(); }
		return q;
	}

	private SubQueue() { this.ll = new LinkedList<Submission>(); }
	public void add(Submission s) { q.ll.add(s); }
	public void process() { System.out.println(q.ll.remove().id()); }
}