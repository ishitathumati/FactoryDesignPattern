package assignments.FactoryDesignPattern;
/**
 * Abstract parent class which gets a toy name, assembles, boxes and prices a toy
 * @author ishitathumati
 *
 */
public abstract class Toy {
	/**
	 * protected variable name that can be accessed by this class and subclasses
	 */
		protected String name;
		
		public String getName() {
			return name;
		}
		
		public void assemble() {
			System.out.println("Putting together a " + name);
		}
		
		public void boxToy() {
			System.out.println("Putting the " + name + " in a box");
		}
		
		public void priceToy() {
			System.out.println("Adding price on " + name);
		}

}
