package constructor;

public class Car {
private String name;
private String color;
private int cost;
private int speed;
private String country;
// parameteried constructor
Car(String a,String b,int c,int d,String e){
	super();
	name=a;
	color=b;
	cost=c;
	speed=d;
	country=e;
}
public String getName()
{
	return name;
}
public String getColor()
{
	return color;
}
public int getCost()
{
	return cost;
}
public int getSpeed()
{
	return speed;
}
public String getCountry()
{
	return country;
}

	}

