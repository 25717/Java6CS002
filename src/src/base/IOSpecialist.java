package base;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

/**This class is to provide a more user-friendly interface for getting a string from the input stream, by abstracting away the details of theunderlying implementation in the IOLibrary class.*/

public class IOSpecialist {
	public IOSpecialist() {
	}

	public String getString() {
		return IOLibrary.getString();
	}
}
