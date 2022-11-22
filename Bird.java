public class Bird extends Animal {
	
	@Override
	public void eat(){
		System.out.print("Birds love to eat seeds");
	}
	
	@Override
	public void sleep(){
		System.out.print("and sleep for 10-12 hours a day");
	}
	
	@Override
	public void makesound(){
		System.out.println("Tweet Tweet");
	}
}