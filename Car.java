package assignments.FactoryDesignPattern;
/**
 * This class extends the abstract Toy class
 * @author ishitathumati
 *
 */
public class Car extends Toy{
	Toy toy;

	/**
	 * constructor sets the toy name
	 */
	public Car() {
		this.name = "Car";
	}
	
	@Override
	/**
	 * overrides the assemble method in the parent class
	 * it calls the parent method and then displays more 
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Make the body\nAdd the wheels\nPaint the car");
	}
}

