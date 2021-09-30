package example;

public class SnakeEssence extends Creature {

	SnakeEssence(){
		super("蛇精");
	}
	
	public void yell() {
		System.out.println(name() + "大吃一惊");
	}
	
}
