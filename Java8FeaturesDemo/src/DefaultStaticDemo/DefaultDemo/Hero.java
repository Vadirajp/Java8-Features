package DefaultStaticDemo.DefaultDemo;

/**
 * @author VADI
 *
 */
public class Hero implements Actor{

	@Override
	public void act() {
		System.out.println("Hero can act");
		
	}

	@Override
	public void speak() {
		System.out.println("Hero can speak");
		
	}
	
	/*public void comedy() {
		System.out.println("Hero can make ppl laugh");
	}*/

}
