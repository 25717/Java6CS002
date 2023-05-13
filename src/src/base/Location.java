package base;

import java.awt.Color;
import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class Location extends SpacePlace {
	
	private LocationCoordinates coordinates;
	
	public Location(int r, int c) {
		this.coordinates = new LocationCoordinates(r, c);
	}
	
	public Location(int r, int c, LocationCoordinates.DIRECTION d) {
		this.coordinates = new LocationCoordinates(r, c, d);
	}

	public String toString() {
		return coordinates.toString();
	}
	//extract method refactoring
	public void drawGridLines(Graphics g) {
		drawHorizontalGridLines(g);
		drawVerticalGridLines(g);
	}
	
	private void drawHorizontalGridLines(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		for (int tmp = 0; tmp <= 7; tmp++) {
			g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
		}
	}
	
	private void drawVerticalGridLines(Graphics g) {
		for (int see = 0; see <= 8; see++) {
			g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
		}
	}
	
	//Divergent change
	public static int getInt() {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		do {
			try {
				return Integer.parseInt(r.readLine());
			} catch (Exception e) {
			}
		} while (true);
	}
}
  class LocationCoordinates {
	public int c; //column
	public int r; //rows
	public DIRECTION d; //direction
	
	public enum DIRECTION {
		VERTICAL, HORIZONTAL
	};
	

	public LocationCoordinates(int r, int c) {
		this.r = r;
		this.c = c;
	}

	public LocationCoordinates(int r, int c, DIRECTION d) {
		this(r, c);
		this.d = d;
	}

	public String toString() { //Split temporary variables
		int temp;
		if (d == null) {
			temp = c + 1;
			return "(" + (temp) + "," + (r + 1) + ")";
		} else {
			temp = c + 1;
			return "(" + (temp) + "," + (r + 1) + "," + d + ")";
		}
	}
	
}