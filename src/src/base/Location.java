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
	public int c; //column
	public int r; //rows
	public DIRECTION d; //direction
	public int tmp;

	public enum DIRECTION {
		VERTICAL, HORIZONTAL
	};

	public Location(int r, int c) {
		this.r = r;
		this.c = c;
	}

	public Location(int r, int c, DIRECTION d) {
		this(r, c);
		this.d = d;
	}

	public String toString() {
		if (d == null) {
			tmp = c + 1;
			return "(" + (tmp) + "," + (r + 1) + ")";
		} else {
			tmp = c + 1;
			return "(" + (tmp) + "," + (r + 1) + "," + d + ")";
		}
	}

	public void drawGridLines(Graphics g) {
		
		drawHorizontalGridLines(g);
		drawVerticalGridLines(g);
	}
	
	private void drawHorizontalGridLines(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		for (tmp = 0; tmp <= 7; tmp++) {
			g.drawLine(20, 20 + tmp * 20, 180, 20 + tmp * 20);
		}
	}
	
	private void drawVerticalGridLines(Graphics g) {
		for (int see = 0; see <= 8; see++) {
			g.drawLine(20 + see * 20, 20, 20 + see * 20, 160);
		}
	}
	
	
////// DIVERGENT CHANGEEEE>>>////
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