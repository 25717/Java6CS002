package base;
/**
* @author Kevan Buckley, maintained by __student
* @version 2.0, 2014
*/

/** The class "Domino" which represents a domino tile in a game*/
/**
 * The class implements the "Comparable" interface, which means it has a method
 * called "compareTo" that can be used to compare two domino objects based on
 * their values
 */
public class Domino implements Comparable<Domino> {
	public int high; // Higher int value of the domino tile
	public int low; // Lower int value of the domino tile
	public int hx;
	public int hy; /*
					 * representing the x and y coordinates of the high and low ends of the domino
					 * tile
					 */
	public int lx;
	public int ly;
	public boolean placed = false; // placed in the board or not

	public Domino(int high, int low) {
		super();
		this.high = high;
		this.low = low;
	}
//remove assignment and parameter refactoring
	public void place(int newHx, int newHy, int newLx, int newLy) { // sets the corresponding attributes
		this.hx = newHx;
		this.hy = newHy;
		this.lx = newLx;
		this.ly = newLy;
		placed = true;
	}

	/**
	 * method to return a string representation of the domino, its values and its
	 * placemnt status
	 */
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("[");
		result.append(Integer.toString(high));
		result.append(Integer.toString(low));
		result.append("]");
		if (!placed) {
			result.append("unplaced");
		} else {
			result.append("(");
			result.append(Integer.toString(hx + 1));
			result.append(",");
			result.append(Integer.toString(hy + 1));
			result.append(")");
			result.append("(");
			result.append(Integer.toString(lx + 1));
			result.append(",");
			result.append(Integer.toString(ly + 1));
			result.append(")");
		}
		return result.toString();
	}

	/** turn the domino around 180 degrees clockwise */

	public void invert() {
		int tx = hx;
		hx = lx;
		lx = tx;

		int ty = hy;
		hy = ly;
		ly = ty;
	}

	/**
	 * returns a boolean indicating whether the domino is a horizontal or a vertical
	 * position.
	 */

	//Rename method refactoring
	public boolean ishorizontal() {
		return hy == ly;
	}

	/**
	 * compares two dominos based on their values and return a value less than,
	 * equal to or greater than the other domino
	 */
	public int compareTo(Domino arg0) {
		if (this.high < arg0.high) {
			return 1;
		}
		return this.low - arg0.low;
	}

}