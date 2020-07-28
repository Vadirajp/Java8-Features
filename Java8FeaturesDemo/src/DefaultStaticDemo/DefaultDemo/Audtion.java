package DefaultStaticDemo.DefaultDemo;

/**
 * @author VADI
 *
 */
public class Audtion {

	public static void main(String[] args) {
		
		Hero hero = new Hero();
		hero.act();
		hero.speak();
		hero.comedy();
		
		Villan villan = new Villan();
		villan.act();
		villan.speak();

	}

}
