import java.util.LinkedList;

public class RoboTest {
	private static LinkedList<Visitable> components = new LinkedList<Visitable>();
	private static Logger logger = new Logger();

	public static void main(String[] args) {
		Arena arena = new Arena(1, 2);
		Robot r1 = new Robot(1, 2, 2);
		Robot r2 = new Robot(2, 3, 1);
		Wall w1 = new Wall(1, 2, 3, 4, 5, 6);
		Wall w2 = new Wall(1, 3, 5, 5, 2, 1);
		Wall w3 = new Wall(6, 5, 4, 3, 2, 1);
		Wall w4 = new Wall(2, 3, 5, 1, 3, 6);

		components.add(arena);
		components.add(r1);
		components.add(r2);
		components.add(w1);
		components.add(w2);
		components.add(w3);
		components.add(w4);

		for(short i = 0; i < components.size(); i++) {
			components.get(i).accept(logger);
		}
		logger.logData();
	}
}