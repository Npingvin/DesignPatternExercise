class NetworkDriver {
	public static void main(String[] args) {
		MovementNetwork mn = new MovementNetwork();
		mn.learn(); mn.learn();
		System.out.println("First network's response: "+mn.respond());
		NeuralNetwork c1 = mn.clone();
		c1.learn(); c1.learn();
		System.out.println("Clone of ^ that's response after learning: "+c1.respond());
	}
}