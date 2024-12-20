package constructor;

public class Begin {

	public static void main(String[] args) {
		//involking the constructor
		Car c=new Car("Civic","Red",500000,120,"japan");
	    System.out.println(c.getName());
	    System.out.println(c.getColor());
	    System.out.println(c.getCost());
	    System.out.println(c.getSpeed());
	    System.out.println(c.getCountry());

	
	}

}
