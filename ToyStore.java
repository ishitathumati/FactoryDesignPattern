package assignments.FactoryDesignPattern;
/**
 * this class is the toy store which allows us to order specific toys
 * @author ishitathumati
 *
 */
public class ToyStore {
	
	public ToyStore() {}
	
	/**
	 * method allows creation of a new instance of a toy
	 * @param type
	 * @return
	 */
	public Toy orderToy(String type) {
		Toy toy;
		
		if(type.equals("doll")){
			toy = new Doll();
		} else if(type.equals("car")){
			toy = new Car();
		}else if(type.equals("rattle")) {
			toy = new Rattle();
		}else {
			toy = new Doll();
		}
		
		toy.assemble();
		toy.boxToy();
		toy.priceToy();
		
		return toy;
	}
}
