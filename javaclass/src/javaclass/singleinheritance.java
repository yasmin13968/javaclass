package javaclass;

class Bicycle
{
	int gear;
	int speed;
	void applybreak(int decrement)
	{
		speed -= decrement;
	}
	void accelerate(int increment)
	{
		speed += increment;
	}
	@Override
	public String toString() {
		return "Bicycle [gear=" + gear + ", speed=" + speed + "]";
	}
	
}
class MountainBike extends Bicycle
{
	int seatHeight;
	void adjustHeight(int value)
	{
		seatHeight=value;
	}
	@Override
	public String toString() {
		return "MountainBike [seatHeight=" + seatHeight + ", gear=" + gear + ", speed=" + speed + "]";
	}
	
	
}
public class singleinheritance {

	public static void main(String[] args) {
		Bicycle obj = new Bicycle();
		obj.gear=5;
		obj.speed=20;
		obj.accelerate(5);
		obj.applybreak(5);
		obj.applybreak(5);
		System.out.println(obj.toString());
		
		MountainBike mb = new MountainBike();
		mb.gear=6;
		mb.speed=30;
		mb.seatHeight=5;
		System.out.println(mb.toString());
		mb.accelerate(10);
		mb.adjustHeight(1);
		mb.applybreak(2);
		System.out.println(mb.toString());
	}

}
