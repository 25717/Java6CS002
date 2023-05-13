package base;

import java.awt.*;

import javax.swing.*;

/**
 * @author Kevan Buckley, maintained by __student
 * @version 2.0, 2014
 */

public class PictureFrame {
	public int[] reroll = null;
	public Main master = null;

	public class DominoPanel extends JPanel {
		private static final long serialVersionUID = 4190229282411119364L;
		private static final int ROW_COUNT = 7;
		private static final int COLUMN_COUNT = 8;
		private static final int CELL_SIZE = 20;
		public int x;
		public int y;
		public int n;
		public int diameter;
		Color c;
		
		public DominoPanel(int x, int y, int diameter, int n, Color c){
			this.x = x;
	        this.y = y;
	        this.diameter = diameter;
	        this.n = n;
	        this.c = c;
		}
		
		//Replace magic Number
		public void drawGrid(Graphics g) {
			for (int are = 0; are < ROW_COUNT; are++) {
				for (int see = 0; see < COLUMN_COUNT; see++) {
					drawDigitGivenCentre(g, 30 + see * CELL_SIZE, 30 + are * CELL_SIZE, CELL_SIZE, master.grid[are][see]);
				}
			}
		}

		public void drawHeadings(Graphics g) {
			for (int are = 0; are < ROW_COUNT; are++) {
				fillDigitGivenCentre(g, 10, 30 + are * CELL_SIZE, CELL_SIZE, are + 1);
			}

			for (int see = 0; see < COLUMN_COUNT; see++) {
				fillDigitGivenCentre(g, 30 + see * CELL_SIZE, 10, CELL_SIZE, see + 1);
			}
		}

		public void drawDomino(Graphics g, Domino d) {
			if (d.placed) {
				int y = Math.min(d.ly, d.hy);
				int x = Math.min(d.lx, d.hx);
				int w = Math.abs(d.lx - d.hx) + 1;
				int h = Math.abs(d.ly - d.hy) + 1;
				g.setColor(Color.WHITE);
				g.fillRect(CELL_SIZE + x * CELL_SIZE, CELL_SIZE + y * CELL_SIZE, w * CELL_SIZE, h * CELL_SIZE);
				g.setColor(Color.RED);
				g.drawRect(CELL_SIZE + x * CELL_SIZE, CELL_SIZE + y * CELL_SIZE, w * CELL_SIZE, h * CELL_SIZE);
				drawDigitGivenCentre(g, new DominoPanel(30 + d.hx * CELL_SIZE, 30 + d.hy * CELL_SIZE, CELL_SIZE, d.high, Color.BLUE));
				drawDigitGivenCentre(g, new DominoPanel(30 + d.lx * CELL_SIZE, 30 + d.ly * CELL_SIZE, CELL_SIZE, d.low, Color.BLUE));
			}
		}
		
///////DUPLICATED CODE///////
		void drawDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
			int radius = diameter / 2;
			g.setColor(Color.BLACK);
// g.drawOval(x - radius, y - radius, diameter, diameter);
			FontMetrics fm = g.getFontMetrics();
// convert the string to an integer
			String txt = Integer.toString(n);
			g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
		}
//////LONG PARAMETER////////
		public void drawDigitGivenCentre(Graphics g, DominoPanel dp ) {
			int radius = dp.diameter / 2;
			g.setColor(dp.c);
// g.drawOval(x - radius, y - radius, diameter, diameter);
			FontMetrics fm = g.getFontMetrics();
			String txt = Integer.toString(dp.n);
			g.drawString(txt, dp.x - fm.stringWidth(txt) / 2, dp.y + fm.getMaxAscent() / 2);
		}

		void fillDigitGivenCentre(Graphics g, int x, int y, int diameter, int n) {
			int radius = diameter / 2;
			g.setColor(Color.GREEN);
			g.fillOval(x - radius, y - radius, diameter, diameter);
			g.setColor(Color.BLACK);
			g.drawOval(x - radius, y - radius, diameter, diameter);
			FontMetrics fm = g.getFontMetrics();
			String txt = Integer.toString(n);
			g.drawString(txt, x - fm.stringWidth(txt) / 2, y + fm.getMaxAscent() / 2);
		}

		protected void paintComponent(Graphics g) {
			g.setColor(Color.YELLOW);
			g.fillRect(0, 0, getWidth(), getHeight());

// numbaz(g);
//
// if (master!=null && master.orig != null) {
// drawRoll(g, master.orig);
// }
// if (reroll != null) {
// drawReroll(g, reroll);
// }
//
// drawGrid(g);
			Location l = new Location(1, 2); //Consolidate Duplicate Fragment
			l.drawGridLines(g);
			drawHeadings(g);
			drawGrid(g);

			if (master.mode == 1) {
				master.drawGuesses(g);
			}
			if (master.mode == 0) {
				master.drawDominoes(g);
			}
		}

		public Dimension getPreferredSize() {
// the application window always prefers to be 202x182
			return new Dimension(202, 182);
		}
	}

	public DominoPanel dp;

	public void PictureFrame(Main sf) {
		master = sf;
		if (dp == null) {
			JFrame f = new JFrame("Abominodo");
			dp = new DominoPanel(0, 0, 0, 0, null);
			f.setContentPane(dp);
			f.pack();
			f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			f.setVisible(true);
		}
	}

	public void reset() {
// TODO Auto-generated method stub

	}

}