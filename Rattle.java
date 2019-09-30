package assignments.FactoryDesignPattern;
/**
 * This class extends the abstract Toy class
 * @author ishitathumati
 *
 */
public class Rattle extends Toy {

	/**
	 * constructor sets the toy name
	 */
	public Rattle() {
		this.name = "Rattle";
	}
	
	@Override
	/**
	 * overrides the assemble method in the parent class
	 * it calls the parent method and then displays more 
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Create the frame\nAdd the pebbles\nSecure the sides");
	}
}
