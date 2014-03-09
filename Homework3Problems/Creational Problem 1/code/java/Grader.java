public class Grader {
	private static SubQueue q = SubQueue.getInstance();
	public static void main(String[] args) {
		for(short i = 0; i < 5; i++)
			{ q.add(new Submission()); }
		for(short i = 0; i < 5; i++)
			{ q.process(); }
	}
}