import groovy.util.ConfigObject;

public class Change1 {
	
	public static void getName() {
		System.out.println("My name is A");
	}
	public String setName(String name) {
		return name;
	}
	
	public void add() {
		int a=0;
		int b = 0;
	int	sum = a+b;
		System.out.println("The sum is "+sum);
	}

	public static void main(String[] args) {
		
		Object  b = new Object();
		b.getClass();
		
		getName();
		
	}

}
