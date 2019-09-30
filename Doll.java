package assignments.FactoryDesignPattern;
/**
 * This class extends the abstract Toy class
 * @author ishitathumati
 *
 */
public class Doll extends Toy{

	/**
	 * constructor sets the toy name
	 */
	public Doll() {
		this.name = "Doll";
	}
	
	@Override
	/**
	 * overrides the assemble method in the abstract parent class
	 * it calls the parent method and then displays more 
	 */
	public void assemble() {
		super.assemble();
		System.out.println("Connecting all pieces\nPainting the face\nAdding the dress\nAdding the shoes");
	}
}
