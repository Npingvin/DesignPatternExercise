class Game {
	public static void main(String[] args) {
		Mario mario = new StandardMario();
		mario.draw();
		mario = new MushroomMario();
		mario.draw();
		mario = new FlowerMario();
		mario.draw();
		mario = new StarMario();
		mario.draw();
	}
}