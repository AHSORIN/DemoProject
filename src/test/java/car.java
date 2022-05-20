
public class car extends vehicle {
	
	public void engine() {
		System.out.println("Child class engine");
	}
	public void color() {
		System.out.println("child car color");
	}
	public static void main(String args[]) {
		
		vehicle v=new vehicle();
		car c=new car();
		vehicle v1=new car();
		c.engine();
		v.engine();
		c.speed();
		v1.engine();
		v1.color1();
	}

}
